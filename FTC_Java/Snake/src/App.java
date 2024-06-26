// Windows: 
// import javax.swing.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         int boardWidth = 600;
//         int boardHeight = boardWidth;
//         JFrame frame = new JFrame("Snake Game");
//         frame.setVisible(true);
//         frame.setSize(boardWidth, boardHeight);
//         frame.setLocationRelativeTo(null); // open in the center of the screen
//         frame.setResizable(false);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window when user click the close button
//     }
// }

// Mac:
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int boardWidth = 600;
        int boardHeight = boardWidth;
        int tileSize = 25;

        JFrame frame = new JFrame("Snake Game");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // open in the center of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window when user clicks the close button

        // add the Instance of SnakeGame panel to the frame
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
    }
}
