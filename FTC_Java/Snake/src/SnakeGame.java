import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList; // store the sagments of the snake body
import java.util.Random; // generate random x and y coordinates for the food
import javax.swing.*;

/**
 * The SnakeGame class is the inherited class of JPanel.
 * It for drawing the snake and food on the screen.
 * <p>
 * The main method initializes the JFrame and configures its properties.
 * </p>
 * 
 * @author Your Name
 * @version 1.0
 */
public class SnakeGame extends JPanel{
    private class Tile{
        int x;
        int y;
        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    // class variables
    int boardWidth;
    int boardHeight;

    Tile snakeHead;
    // constructor
    // the two parameters are the width and height of the board
    public SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        // set the size of the panel
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        snakeHead = new Tile(5, 5);
    }
    
}
