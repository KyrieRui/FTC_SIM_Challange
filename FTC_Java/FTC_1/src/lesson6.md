### lesson 6

#### Recape

- What is a class?

  - A class is a blueprint for an object.
  - name should start with a capital letter.
  - A class can have class variables and class methods.

  ```java
    public class Motor {
        // class variables
        String direction;
        int speed;

        // class method
        public void displayInfo() {
            System.out.println("Motor Direction: " + direction);
            System.out.println("Motor Speed: " + speed);
        }
    }
  ```

- What is an object? - An object is an instance of a class. - An object can have instance variables and instance methods.
  `java
  Motor motor = new Motor(); // create an Class object
  motor.direction = "Clockwise"; // set the value of the direction variable
  motor.speed = 50; 
  motor.displayInfo(); // call the displayInfo method
`
- What is a method?

  - A method is a block of code that performs a specific task.
  - A method can have parameters and a return type.
  - A method can have a return value or return nothing (void). 'getter'

  ```java
      public void displayInfo() {
          System.out.println("Motor Direction: " + direction);
          System.out.println("Motor Speed: " + speed);
      }

      public int getSpeed() {
          return speed;
      }

      public void setSpeed(int speed) {
          this.speed = speed;
      }
  ```

- What is a constructor?
  - A constructor is a special method that is used to initialize objects of a class.
  - Constructors have the same name as the class and do not have a return type.
  - A constructor can have parameters.
  - A constructor is called when an object is created.
  ```java
      public Motor(String direction, int speed) {
          this.direction = direction;
          this.speed = speed;
      }
  ```
- What is a parameter?
  - A parameter is a variable that is used to pass information
  - A parameter is defined in the method signature.
  ```java
      public void setSpeed(int speed) {
          this.speed = speed;
      }
  ```
- What is a return type?

  - A return type is the data type of the value that a method returns.
  - A return type is defined in the method signature.

  ```java
      public int getSpeed() {
          return speed;
      }
  ```

- What is OOP?

  - Class: A blueprint or template that defines the properties and behaviors (methods) of objects.
  - Object: An instance of a class. Each object has its own set of properties and can perform behaviors defined by the class.
  - Encapsulation: Bundling the data (properties) and methods that operate on the data into a single unit, typically a class, and restricting access to some of the object's components.
  - Inheritance: A mechanism where one class (child class) inherits the properties and methods of another class (parent class). This allows for code reuse and the creation of a hierarchical relationship between classes.
  - Polymorphism: The ability of different classes to be treated as instances of the same class through inheritance. It also allows methods to do different things based on the object it is acting upon.

- What is String? - A String is a sequence of characters. - A String is a reference type. - A String is immutable. - A String can be created using a String literal or a String object.

      ```java
        String name = "John";
        String message = new String("Hello, World!");
      ```

- What is a variable?

      - we saw two types of variables
        - primitive variables
        - reference variables

      ```java
        // primitive variables
        int speed = 50;
        double distance = 100.5;
        String name = "John";

        // reference variables
        Motor motor = new Motor();
        motor.direction = "Clockwise"; // dot operator for accessing the class variables
      ```

- What is Array

  - An array is a data structure that stores a collection of elements of the same data type.
  - An array has a fixed size.
  - An array can be initialized with values.
  - An array can be accessed using an index.

  ```java
      int[] numbers = new int[5];
      numbers[0] = 10;
      numbers[1] = 20;
      numbers[2] = 30;
      numbers[3] = 40;
      numbers[4] = 50;
  ```

- What is a loop?

  - A loop is a control structure that repeats a block of code.
  - A loop has a condition that is evaluated before each iteration.
  - A loop has a body that is executed if the condition is true.
  - A loop has an increment or decrement statement that changes the value of the loop variable.

  ```java
      for (int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
      }
  ```

- if-else statement
  - An if-else statement is a control structure that executes a block of code based on a condition.
  - An if-else statement has an if block that is executed if the condition is true.
  - An if-else statement has an else block that is executed if the condition is false.
  ```java
      if (speed > 0) {
          System.out.println("Motor is moving");
      } else {
          System.out.println("Motor is stopped");
      }
  ```

### if-else

```java
    int speed = 50;
    if (speed > 0) {
        System.out.println("Motor is moving");
    } else {
        System.out.println("Motor is stopped");
    }
```

### switch

```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
    }
```

### while

```java
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }
```

### do-while

```java
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
```

### for

```java
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }
```

### for-each

```java
    int[] numbers = {10, 20, 30, 40, 50};
    for (int number : numbers) {
        System.out.println(number);
    }
```
