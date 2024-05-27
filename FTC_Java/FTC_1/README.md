javac src/App.java
java -cp src App

## Lesson 1: Introduction to Java

- Java is a high-level programming language that is used to create applications for a variety of platforms.
- Java is a statically-typed language, which means that all variables must be declared before they can be used.

### variables

- A variable is a container that holds a value.
- In Java, variables have a specific type, which determines the size and layout of the variable's memory.
- Java has several built-in data types, such as int, double, and boolean, that can be used to declare variables.

```java
int age = 25;
double height = 5.8;
boolean isStudent = true;
String name = "John";

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Height: " + height);
System.out.println("Is Student: " + isStudent);
```

### final variables

- In Java, the final keyword can be used to declare a variable that cannot be changed after it is initialized.
- Final variables are also known as constants.

```java
final int MAX_VALUE = 100;
final double PI = 3.14159;

System.out.println("Max Value: " + MAX_VALUE);
System.out.println("PI: " + PI);
```

### operators

- Java has several operators that can be used to perform arithmetic, logical, and comparison operations.
- Arithmetic operators: +, -, \*, /, %
- Logical operators: && (AND), || (OR), ! (NOT)

```java
int x = 10;
int y = 5;

int sum = x + y;
int difference = x - y;
int product = x * y;
int quotient = x / y;
int remainder = x % y;

System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);
System.out.println("Quotient: " + quotient);
System.out.println("Remainder: " + remainder);
```

### if-else statements and switch statements

- Java has several control flow statements that can be used to control the flow of execution in a program.
- The if-else statement is used to execute a block of code if a condition is true, and another block of code if the condition is false.
- The switch statement is used to execute different blocks of code based on the value of a variable.

```java
int age = 25;

if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

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
    default:
        System.out.println("Invalid day");
}
```

### loops

- Java has several loop statements that can be used to repeat a block of code multiple times.
- The for loop is used to execute a block of code a fixed number of times.
- The while loop is used to execute a block of code as long as a condition is true.
- The do-while loop is similar to the while loop, but the condition is checked after the block of code is executed.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### classes and objects

- Java is an object-oriented programming language, which means that it uses classes and objects to model real-world entities.
- A class is a blueprint for creating objects, and it defines the properties and behaviors of the objects.
- An object is an instance of a class, and it can be used to access the properties and behaviors defined in the class.

```java
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

Person person = new Person();
person.name = "John";
person.age = 25;
person.displayInfo();
```

### final class

- In Java, the final keyword can be used to declare a class that cannot be subclassed.
- Final classes are also known as immutable classes.

```java
public final class MathUtils {

    // Private constructor to prevent instantiation
    private MathUtils() {
        throw new UnsupportedOperationException("Cannot instantiate utility class");
    }

    // Static method for adding two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method for subtracting two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplying two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method for dividing two numbers
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3);
        int difference = MathUtils.subtract(5, 3);
        int product = MathUtils.multiply(5, 3);
        int quotient = MathUtils.divide(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

```
