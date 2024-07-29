import java.awt.*;
import javax.swing.*;

public class Tetris1 
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // Create a window
                JFrame frame = new JFrame();
                frame.setTitle("Tetris");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(525, 525); // Set the window size
                frame.setLocationByPlatform(true); // Let the system decide the window location
                frame.setVisible(true); // Make the window visible
            }
        });
    }
}

