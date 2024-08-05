// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.util.Random;

// public class Tetris5 {
//     public static final int FRAME_WIDTH = 305;
//     public static final int FRAME_HEIGHT = 525;
//     public static final int BLOCK_SIZE = 20;

//     public static void main(String[] args) 
//     {
//         EventQueue.invokeLater(new Runnable()
//         {
//             public void run()
//             {
//                 GameWindow gameWindow = new GameWindow();
//                 gameWindow.setTitle("Simple Tetris");
//                 gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                 gameWindow.setLocationByPlatform(true);
//                 gameWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
//                 gameWindow.setResizable(false);
//                 gameWindow.setVisible(true);
//                 gameWindow.startGame();
//             }
//         });
//     }
// }

// class GameWindow extends JFrame
// {
//     private static final long serialVersionUID = 1L;
//     private Canvas canvas;
//     private Timer timer;
//     private Shape currentShape;
//     public static int[][] space;

//     public GameWindow()
//     {
//         canvas = new Canvas();
//         addKeyListener(new KeyHandler());
//         add(canvas);
//         pack();
//     }

//     public void startGame()
//     {
//         space = new int[Tetris5.FRAME_HEIGHT / Tetris5.BLOCK_SIZE][Tetris5.FRAME_WIDTH / Tetris5.BLOCK_SIZE];
//         spawnNewBlock();
//         timer = new Timer(300, new TimerHandler());
//         timer.start();
//     }

//     private void spawnNewBlock()
//     {
//         currentShape = Shape.getRandomShape();
//         currentShape.setPosition((Tetris5.FRAME_WIDTH / Tetris5.BLOCK_SIZE) / 2, 0);
//         if (isCollision(currentShape.getShapeCoords())) {
//             gameOver();
//         } else {
//             updateSpace(currentShape.getShapeCoords(), 1);
//         }
//     }

//     private boolean moveDown()
//     {
//         Shape movedShape = currentShape.clone();
//         movedShape.move(0, 1);
//         if (isCollision(movedShape.getShapeCoords())) {
//             return false;
//         }
//         updateSpace(currentShape.getShapeCoords(), 0);
//         currentShape.move(0, 1);
//         updateSpace(currentShape.getShapeCoords(), 1);
//         return true;
//     }

//     private void moveLeft()
//     {
//         Shape movedShape = currentShape.clone();
//         movedShape.move(-1, 0);
//         if (!isCollision(movedShape.getShapeCoords())) {
//             updateSpace(currentShape.getShapeCoords(), 0);
//             currentShape.move(-1, 0);
//             updateSpace(currentShape.getShapeCoords(), 1);
//         }
//     }

//     private void moveRight()
//     {
//         Shape movedShape = currentShape.clone();
//         movedShape.move(1, 0);
//         if (!isCollision(movedShape.getShapeCoords())) {
//             updateSpace(currentShape.getShapeCoords(), 0);
//             currentShape.move(1, 0);
//             updateSpace(currentShape.getShapeCoords(), 1);
//         }
//     }

//     private void updateSpace(Point[] shapeCoords, int flag)
//     {
//         for (Point p : shapeCoords) {
//             space[p.y][p.x] = flag;
//         }
//     }

//     private boolean isCollision(Point[] shapeCoords)
//     {
//         for (Point p : shapeCoords) {
//             if (p.x < 0 || p.x >= space[0].length || p.y >= space.length || space[p.y][p.x] == 1) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     private void gameOver()
//     {
//         timer.stop();
//         JOptionPane.showMessageDialog(this, "Game Over");
//     }

//     class TimerHandler implements ActionListener
//     {
//         public void actionPerformed(ActionEvent e) 
//         {
//             if (!moveDown()) 
//             {
//                 fixBlock();
//                 spawnNewBlock();
//             }
//             canvas.repaint();
//         }

//         private void fixBlock()
//         {
//             updateSpace(currentShape.getShapeCoords(), 1);
//         }
//     }

//     private class KeyHandler extends KeyAdapter
//     {
//         public void keyPressed(KeyEvent e) 
//         {
//             super.keyPressed(e);
//             switch (e.getKeyCode())
//             {
//                 case KeyEvent.VK_DOWN:
//                     timer.setDelay(30);
//                     break;
//                 case KeyEvent.VK_LEFT:
//                     moveLeft();
//                     canvas.repaint();
//                     break;
//                 case KeyEvent.VK_RIGHT:
//                     moveRight();
//                     canvas.repaint();
//                     break;
//             }
//         }

//         public void keyReleased(KeyEvent e)
//         {
//             super.keyReleased(e);
//             if (e.getKeyCode() == KeyEvent.VK_DOWN)
//             {
//                 timer.setDelay(300);
//             }
//         }
//     }
// }

// class Canvas extends JComponent
// {
//     private static final long serialVersionUID = 1L;

//     protected void paintComponent(Graphics g) 
//     {
//         super.paintComponent(g);
//         Graphics2D g2 = (Graphics2D) g;
//         g2.setColor(Color.RED);
//         for (int i = 0; i < GameWindow.space.length; i++)
//         {
//             for (int j = 0; j < GameWindow.space[i].length; j++)
//             {
//                 if (GameWindow.space[i][j] == 1)
//                     g2.fillRect(j * Tetris5.BLOCK_SIZE, i * Tetris5.BLOCK_SIZE, Tetris5.BLOCK_SIZE, Tetris5.BLOCK_SIZE);
//             }
//         }
//     }
// }

// class Shape {
//     private Point[] coords;
//     private Point position;
//     private static final Point[][][] SHAPES = {
//         // I Shape
//         {{new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)}},
//         // O Shape
//         {{new Point(0, 0), new Point(1, 0), new Point(0, 1), new Point(1, 1)}},
//         // T Shape
//         {{new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1)}},
//         // L Shape
//         {{new Point(0, 0), new Point(0, 1), new Point(0, 2), new Point(1, 2)}},
//         // J Shape
//         {{new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2)}},
//         // S Shape
//         {{new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1)}},
//         // Z Shape
//         {{new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1)}}
//     };

//     public Shape(Point[] coords) {
//         this.coords = coords;
//         this.position = new Point(0, 0);
//     }

//     public void setPosition(int x, int y) {
//         position.x = x;
//         position.y = y;
//     }

//     public void move(int dx, int dy) {
//         position.x += dx;
//         position.y += dy;
//     }

//     public Point[] getShapeCoords() {
//         Point[] shapeCoords = new Point[coords.length];
//         for (int i = 0; i < coords.length; i++) {
//             shapeCoords[i] = new Point(coords[i].x + position.x, coords[i].y + position.y);
//         }
//         return shapeCoords;
//     }

//     public Shape clone() {
//         Shape clone = new Shape(coords);
//         clone.setPosition(position.x, position.y);
//         return clone;
//     }

//     public static Shape getRandomShape() {
//         Random rand = new Random();
//         Point[] shapeCoords = SHAPES[rand.nextInt(SHAPES.length)][0];
//         Point[] coords = new Point[shapeCoords.length];
//         for (int i = 0; i < shapeCoords.length; i++) {
//             coords[i] = new Point(shapeCoords[i]);
//         }
//         return new Shape(coords);
//     }
// }
