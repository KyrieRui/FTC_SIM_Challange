## Term 1 final project: Sanke Game

### Create Java project

1. 'control + shift + p' to open command palette
2. 'Java: Create Java Project'
3. 'SnakeGame' as project name
4. 'src' as source folder

### WindowBuilder

    - go to App.java, delete the code in main method
    - import javax.swing.*;
    - goto main function, define some variables:
        - int boardWidth = 600;
        - int boardHeight = boardWidth;
        - JFrame frame = new JFrame("Snake Game");
        - frame.setVisible(true);
        - frame.setSize(boardWidth, boardHeight);
        - frame.setLocationRelativeTo(null); // open in the center of the screen
        - frame.setResizable(false);
        - frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window when user click the close button

### JPanel

    - after we have window, we need to add a panel to the window
    - the JPanel is for draw our game
    - create a new file called 'SnakeGame.java'

```java
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
    // class variables
    int boardWidth;
    int boardHeight;

    // constructor
    // the two parameters are the width and height of the board
    public SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        // set the size of the panel
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
    }

}
```

### Tile

    in the SnakeGame class, we need to create a Tile class to store the x and y coordinates of the snake and food
    - create a new file called 'Tile.java'

```java
private class Tile{
        int x;
        int y;
        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
```
