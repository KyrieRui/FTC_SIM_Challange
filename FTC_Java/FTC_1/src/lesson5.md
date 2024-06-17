## lesson 5

### Recape

#### back slash

- back slash is used to escape special characters in a string.

#### Array

- storing multiple values
- two ways we can define array

  - int[] numbers = new int[5];
  - int[] numbers = {1, 2, 3, 4, 5};

- 2D Array

  - int[][] numbers = new int[2][3];
  - int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

- 3D Array
  - int[][][] numbers = new int[2][3][4];
  - int[][][] numbers = {{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}};

#### Scanner

- why we need scanner?

  - the more flexible way to get input from the user
  - eg. int a = 10; // we type 10 in the code to initialize a
  - // the more flexible way should be like:
    // when the program runs, it will ask user to input a number and then assign the number to a

- do we need follow that stpes?:

  - physically connect the keyboard to the computer
  - pair the keyboard
  - check connection
  - verify the keyboard is working
  - record the keyboard's MAC address
  - get the keyboard's input ....

- No, we don't need to do that. Java have a built-in class called 'Scanner' to handle the input from the user.

- so basically, we just focus on this:

  - Java have a built-in class called 'Scanner' to handle the input from the user.

    - import the Scanner class (find where the Scanner class is located)

    ```java
    import java.util.Scanner;
    ```

    - create a Scanner object

    ```java
    Scanner sc = new Scanner(System.in); // remember in Java how we print out things? 'System.out'
    ```

    - use the Scanner object to get input from the user

    ```java
    int a = sc.nextInt();
    ```

#### Exercise 1

- create a program that asks the user to input 5 numbers and then print out the sum of the 5 numbers.

```java
import java.util.Scanner;

public class ScannerExample01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please input a number: ");
            sum += sc.nextInt();
        }
        System.out.println("The sum of the 5 numbers is: " + sum);
    }
}
```

#### Add int with Double

![Alt text](image-2.png)

- in Java, when we need to add an int with a double, we can't just do it directly. We need to convert the int to a double first.

- variable type casting

  - int -> double

    ```java
    int a = 10;
    double b = (double) a;
    ```

  - double -> int

        ```java
        double a = 10.5;
        int b = (int) a;
        ```

    ![Alt text](image-3.png)

- the casting need to follow the range of the variable type

  - byte -> short -> int -> long -> float -> double

  - rule 1: if the variable type is smaller than the target variable type, we can do the casting directly.
  - rule 2: byte short and char will be promoted to int when doing arithmetic operations.
