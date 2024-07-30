import java.awt.*;
import javax.swing.*;

public class Tetris2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Create a window
                JFrame frame = new JFrame();
                frame.setTitle("Tetris");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(305, 525); // Set the window size
                frame.setLocationByPlatform(true); // Let the system decide the window location

                // Create a custom drawing panel
                CustomPanel canvas = new CustomPanel();
                canvas.setBackground(Color.WHITE); // Set the canvas background to white
                frame.add(canvas); // Add the canvas to the window

                System.out.println("Canvas added to frame"); // Debug output

                frame.setVisible(true); // Make the window visible
            }
        });
    }
}

// Custom drawing panel
class CustomPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public CustomPanel() {
        System.out.println("Canvas constructor called"); // Debug output
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("paintComponent called"); // Debug output
        System.out.println("Canvas size: " + getWidth() + "x" + getHeight()); // Output canvas size

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK); // Set color to black

        // Draw a square in the center of the panel
        int size = 50; // Size of the square
        int x = (getWidth() - size) / 2; // Calculate x coordinate to center the square
        int y = (getHeight() - size) / 2; // Calculate y coordinate to center the square
        g2.fillRect(x, y, size, size); // Draw the square
    }
}

// Output: