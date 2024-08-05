import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tetris4 {
    public static final int FRAME_WIDTH = 305;
    public static final int FRAME_HEIGHT = 525;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
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

class GameWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public GameWindow() {
        Canvas canvas = new Canvas();
        add(canvas);
        pack(); // Call pack() to set the window size based on the canvas preferred size
    }
}

class Canvas extends JComponent {
    private static final long serialVersionUID = 1L;
    public static final int BLOCK_SIZE = 20;
    private int x = 50;
    private int y = 0;
    private Timer timer;

    public Canvas() {
        setPreferredSize(new Dimension(Tetris4.FRAME_WIDTH, Tetris4.FRAME_HEIGHT));
        
        timer = new Timer(50, new ActionListener() { // Set the timer to trigger more frequently
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y + BLOCK_SIZE < Tetris4.FRAME_HEIGHT) {
                    y += 2; // Increase y by a smaller amount each time
                } else {
                    timer.stop();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, BLOCK_SIZE, BLOCK_SIZE);
    }
}
