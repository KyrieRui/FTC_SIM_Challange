### Tetris1.java

```java
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

```

### Explanation

1. **Import Statements** :

- `import java.awt.*;`: This imports all classes from the `java.awt` package, which contains tools for building graphical user interfaces (GUIs).
- `import javax.swing.*;`: This imports all classes from the `javax.swing` package, which is used for creating GUI components like windows, buttons, and text fields.

1. **Class Definition** :

- `public class Tetris1 { ... }`: This defines a public class named `Tetris1`. Everything inside the curly braces `{...}` is part of this class.

1. **Main Method** :

- `public static void main(String[] args) { ... }`: This is the main method, which is the entry point of the program. The program starts running from here.

1. **EventQueue.invokeLater** :

- `EventQueue.invokeLater(new Runnable() { ... })`: This ensures that the code inside `run` runs on the event-dispatching thread, which is responsible for managing GUI events like button clicks and window movements. It helps keep the GUI responsive and thread-safe.

1. **Creating and Setting Up the JFrame** :

- `JFrame frame = new JFrame();`: This creates a new window (JFrame).
- `frame.setTitle("Tetris");`: This sets the title of the window to "Tetris".
- `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`: This makes sure the program exits when the window is closed.
- `frame.setSize(525, 525);`: This sets the size of the window to 525 pixels wide and 525 pixels tall.
- `frame.setLocationByPlatform(true);`: This lets the operating system decide where to place the window on the screen.
- `frame.setVisible(true);`: This makes the window visible. If you don’t call this, the window won’t show up.

### Why Use EventQueue.invokeLater

In Swing (the GUI toolkit used here), all GUI-related tasks should be run on the event-dispatching thread to ensure that the interface remains responsive and thread-safe. `EventQueue.invokeLater` is used to place the creation and setup of the window on this thread.

### Summary

This code creates a simple window with the title "Tetris". It sets up the window size, ensures it closes the application when the window is closed, and makes the window visible. This is the basic setup for creating a graphical application in Java using Swing.

### Tetris2.java

```java
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
```

### Explanation

1. **Import Statements** :

- `import java.awt.*;`: Imports all classes from the `java.awt` package, which includes tools for building graphical user interfaces (GUIs).
- `import javax.swing.*;`: Imports all classes from the `javax.swing` package, which includes GUI components like windows, buttons, and text fields.

1. **Main Class `Tetris2`** :

- `public class Tetris2 { ... }`: Defines a public class named `Tetris2`. Everything inside the curly braces `{...}` is part of this class.

1. **Main Method** :

- `public static void main(String[] args) { ... }`: This is the main method, the entry point of the program. The program starts running from here.

1. **EventQueue.invokeLater** :

- `EventQueue.invokeLater(new Runnable() { ... })`: Ensures that the code inside `run` runs on the event-dispatching thread, responsible for managing GUI events like button clicks and window movements. This keeps the GUI responsive and thread-safe.
- `new Runnable() { public void run() { ... } }`: Creates an anonymous inner class that implements the `Runnable` interface. The `run` method contains the code you want to run on the event-dispatching thread.

1. **Creating and Setting Up the JFrame** :

- `JFrame frame = new JFrame();`: Creates a new window (JFrame).
- `frame.setTitle("Tetris");`: Sets the title of the window to "Tetris".
- `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`: Makes sure the program exits when the window is closed.
- `frame.setSize(305, 525);`: Sets the size of the window to 305 pixels wide and 525 pixels tall.
- `frame.setLocationByPlatform(true);`: Lets the operating system decide where to place the window on the screen.
- `CustomPanel canvas = new CustomPanel();`: Creates a new instance of `CustomPanel`, your custom drawing panel.
- `canvas.setBackground(Color.WHITE);`: Sets the background color of the canvas to white.
- `frame.add(canvas);`: Adds the custom drawing panel to the window.
- `System.out.println("Canvas added to frame");`: Prints a debug message to the console.
- `frame.setVisible(true);`: Makes the window visible. If you don’t call this, the window won’t show up.

1. **Custom Drawing Panel `CustomPanel`** :

- `class CustomPanel extends JPanel { ... }`: Defines a new class `CustomPanel` that extends `JPanel`, which means it inherits all the functionality of a standard panel but can also have custom drawing.
- `public CustomPanel() { ... }`: This is the constructor for the `CustomPanel` class. It prints a debug message when a `CustomPanel` object is created.
- `protected void paintComponent(Graphics g) { ... }`: This method is called whenever the panel needs to be redrawn. It allows you to define custom painting code.
- `super.paintComponent(g);`: Calls the superclass’s `paintComponent` method to ensure the panel is properly rendered.
- `Graphics2D g2 = (Graphics2D) g;`: Casts the `Graphics` object to `Graphics2D` for more advanced drawing capabilities.
- `g2.setColor(Color.BLACK);`: Sets the drawing color to black.
- `int size = 50;`: Defines the size of the square.
- `int x = (getWidth() - size) / 2;`: Calculates the x-coordinate to center the square horizontally.
- `int y = (getHeight() - size) / 2;`: Calculates the y-coordinate to center the square vertically.
- `g2.fillRect(x, y, size, size);`: Draws a filled square at the specified coordinates.

### Summary

This code creates a simple window with the title "Tetris". Inside the window, it adds a custom drawing panel (`CustomPanel`) that draws a black square in the center. This is a basic setup for creating a graphical application in Java using Swing.
