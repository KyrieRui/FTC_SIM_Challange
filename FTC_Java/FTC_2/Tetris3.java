import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Tetris3 
{
    public static final int FRAME_WIDTH = 305;
    public static final int FRAME_HEIGHT = 525;

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                GameWindow gameWindow = new GameWindow();
                gameWindow.setTitle("Tetris");
                gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameWindow.setLocationByPlatform(true);
                gameWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                gameWindow.setResizable(false);
                gameWindow.setVisible(true);
            }
        });
    }
}


class GameWindow extends JFrame
{
    private static final long serialVersionUID = 1L;

    public GameWindow()
    {
        // Set up the game window
        Canvas canvas = new Canvas();
        add(canvas);
        pack();
    }
}


class Canvas extends JComponent
{
    private static final long serialVersionUID = 1L;
    public static final int BLOCK_SIZE = 20;

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, BLOCK_SIZE, BLOCK_SIZE); // Draw a single block at (50, 50)
    }
}
