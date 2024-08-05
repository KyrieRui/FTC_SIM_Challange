import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tetris_complete{
    public static final int FRAME_WIDTH = 305;
    public static final int FRAME_HEIGHT = 525;
    public static final int BLOCK_SIZE = 20;

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                GameWindow gameWindow = new GameWindow();
                gameWindow.setTitle("Simple Tetris");
                gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameWindow.setLocationByPlatform(true);
                gameWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                gameWindow.setResizable(false);
                gameWindow.setVisible(true);
                gameWindow.startGame();
            }
        });
    }
}

class GameWindow extends JFrame
{
    private static final long serialVersionUID = 1L;
    private Canvas canvas;
    private Timer timer;
    private Point centerPos = new Point();
    public static int[][] space;

    public GameWindow()
    {
        canvas = new Canvas();
        addKeyListener(new KeyHandler());
        add(canvas);
        pack();
    }

    public void startGame()
    {
        space = new int[Tetris_complete.FRAME_HEIGHT / Tetris_complete.BLOCK_SIZE][Tetris_complete.FRAME_WIDTH / Tetris_complete.BLOCK_SIZE];
        centerPos.x = (Tetris_complete.FRAME_WIDTH / Tetris_complete.BLOCK_SIZE) / 2;
        centerPos.y = 0;
        updateSpace(1);
        timer = new Timer(300, new TimerHandler());
        timer.start();
    }

    private boolean moveDown()
    {
        int x = centerPos.x;
        int y = centerPos.y + 1;
        if (y >= space.length - 1 || space[y][x] == 1)
            return false;
        updateSpace(0);
        centerPos.y++;
        updateSpace(1);
        return true;
    }

    private void moveLeft()
    {
        int x = centerPos.x - 1;
        int y = centerPos.y;
        if (x >= 0 && space[y][x] != 1)
        {
            updateSpace(0);
            centerPos.x--;
            updateSpace(1);
        }
    }

    private void moveRight()
    {
        int x = centerPos.x + 1;
        int y = centerPos.y;
        if (x < space[0].length && space[y][x] != 1)
        {
            updateSpace(0);
            centerPos.x++;
            updateSpace(1);
        }
    }

    private void updateSpace(int flag)
    {
        space[centerPos.y][centerPos.x] = flag;
    }

    private boolean gameOver()
    {
        return centerPos.y == 0 && space[centerPos.y][centerPos.x] == 1;
    }

    class TimerHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (!moveDown()) 
            {
                timer.stop();
                if (gameOver())
                    JOptionPane.showMessageDialog(GameWindow.this, "Game Over");
                else
                    startGame();
            }
            canvas.repaint();
        }
    }

    private class KeyHandler extends KeyAdapter
    {
        public void keyPressed(KeyEvent e) 
        {
            super.keyPressed(e);
            switch (e.getKeyCode())
            {
                case KeyEvent.VK_DOWN:
                    timer.setDelay(30);
                    break;
                case KeyEvent.VK_LEFT:
                    moveLeft();
                    canvas.repaint();
                    break;
                case KeyEvent.VK_RIGHT:
                    moveRight();
                    canvas.repaint();
                    break;
            }
        }
    }
}

class Canvas extends JComponent
{
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        for (int i = 0; i < GameWindow.space.length; i++)
        {
            for (int j = 0; j < GameWindow.space[i].length; j++)
            {
                if (GameWindow.space[i][j] == 1)
                    g2.fillRect(j * Tetris_complete.BLOCK_SIZE, i * Tetris_complete.BLOCK_SIZE, Tetris_complete.BLOCK_SIZE, Tetris_complete.BLOCK_SIZE);
            }
        }
    }
}
