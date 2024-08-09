import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tetris4 {
    public static final int FRAME_WIDTH = 305; // Frame width
    public static final int FRAME_HEIGHT = 525; // Frame height
    public static final int BLOCK_SIZE = 20; // Block size

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                GameWindow gameWindow = new GameWindow(); // Create game window
                gameWindow.setTitle("Simple Tetris"); // Set window title
                gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
                gameWindow.setLocationByPlatform(true); // Set location
                gameWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT); // Set window size
                gameWindow.setResizable(false); // Make window non-resizable
                gameWindow.setVisible(true); // Make window visible
                gameWindow.startGame(); // Start the game
            }
        });
    }
}

class GameWindow extends JFrame
{
    private static final long serialVersionUID = 1L;
    private Canvas canvas; // Canvas for drawing
    private Timer timer; // Timer for block movement
    private Point centerPos = new Point(); // Current position of the block
    public static int[][] space; // Game space grid

    public GameWindow()
    {
        canvas = new Canvas(); // Create canvas
        addKeyListener(new KeyHandler()); // Add key listener
        add(canvas); // Add canvas to frame
        pack(); // Adjust frame size based on canvas
    }

    public void startGame()
    {
        space = new int[Tetris4.FRAME_HEIGHT / Tetris4.BLOCK_SIZE][Tetris4.FRAME_WIDTH / Tetris4.BLOCK_SIZE]; // Initialize game space
        spawnNewBlock(); // Spawn a new block
        timer = new Timer(300, new TimerHandler()); // Create timer with delay and action listener
        timer.start(); // Start timer
    }

    private void spawnNewBlock()
    {
        centerPos.x = (Tetris4.FRAME_WIDTH / Tetris4.BLOCK_SIZE) / 2; // Set initial x position
        centerPos.y = 0; // Set initial y position
        if (space[centerPos.y][centerPos.x] == 1) { // Check if space is occupied
            gameOver(); // End game if space is occupied
        } else {
            updateSpace(1); // Update space with new block
        }
    }

    private boolean moveDown()
    {
        int x = centerPos.x;
        int y = centerPos.y + 1;
        if (y >= space.length - 1 || space[y][x] == 1) // Check if block can move down
            return false;
        updateSpace(0); // Clear current block position
        centerPos.y++; // Move block down
        updateSpace(1); // Update new block position
        return true;
    }

    private void moveLeft()
    {
        int x = centerPos.x - 1;
        int y = centerPos.y;
        if (x >= 0 && space[y][x] != 1) // Check if block can move left
        {
            updateSpace(0); // Clear current block position
            centerPos.x--; // Move block left
            updateSpace(1); // Update new block position
        }
    }

    private void moveRight()
    {
        int x = centerPos.x + 1;
        int y = centerPos.y;
        if (x < space[0].length && space[y][x] != 1) // Check if block can move right
        {
            updateSpace(0); // Clear current block position
            centerPos.x++; // Move block right
            updateSpace(1); // Update new block position
        }
    }

    private void updateSpace(int flag)
    {
        space[centerPos.y][centerPos.x] = flag; // Update game space with block position
    }

    private void gameOver()
    {
        timer.stop(); // Stop the timer
        JOptionPane.showMessageDialog(this, "Game Over"); // Show game over message
    }

    class TimerHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (!moveDown()) 
            {
                fixBlock(); // Fix the current block
                spawnNewBlock(); // Spawn a new block
            }
            canvas.repaint(); // Repaint the canvas
        }

        private void fixBlock()
        {
            space[centerPos.y][centerPos.x] = 1; // Fix the block position in the game space
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
                    timer.setDelay(30); // Speed up the timer for faster downward movement
                    break;
                case KeyEvent.VK_LEFT:
                    moveLeft(); // Move block left
                    canvas.repaint(); // Repaint the canvas
                    break;
                case KeyEvent.VK_RIGHT:
                    moveRight(); // Move block right
                    canvas.repaint(); // Repaint the canvas
                    break;
            }
        }

        public void keyReleased(KeyEvent e)
        {
            super.keyReleased(e);
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                timer.setDelay(300); // Reset the timer delay
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
        g2.setColor(Color.RED); // Set color to red
        for (int i = 0; i < GameWindow.space.length; i++)
        {
            for (int j = 0; j < GameWindow.space[i].length; j++)
            {
                if (GameWindow.space[i][j] == 1) // Check if space is occupied by a block
                    g2.fillRect(j * Tetris4.BLOCK_SIZE, i * Tetris4.BLOCK_SIZE, Tetris4.BLOCK_SIZE, Tetris4.BLOCK_SIZE); // Draw the block
            }
        }
    }
}
