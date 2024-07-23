## Term 2 lesson 1

### Math in Java

```java
int x = 10+3*2;
System.out.println(x);
```

why is the output 16?

- because the multiplication operator has a higher precedence than the addition operator
- if we want to change the order of precedence, we can use parentheses

```java
int x = (10+3)*2;
System.out.println(x);
```

so the order of precedence in Java is:

1. parentheses
2. multiplication or division
3. addition or subtraction

### Casting

```java
short x = 1;
int y = x + 2;
```

- in this case, we adding a short to an int, what do you think the output will be?

```java
System.out.println(y);
```

### implicit casting

- when we print y it will be 3, like we expected
- but lets find out what happens when we add a short to a byte
- when Java adds two different types, it will convert the smaller type to the larger type
- think about how many bytes each type takes up in memory

```java
byte x = 1; // 1 byte
short y = 2; // 2 bytes
int z = x + y; // 4 bytes
```

- so when we add a byte to a short, the byte will be converted to a short, which is called: implicit casting(automatic casting)
- byte -> short -> int -> long

#### next what about the floating point types?

```java
double x = 1.1;
int y = x + 2; // we have a compilation error so we need to change the type of y to double
```

- here also have a casting happening, x is double and 2 is an int, so the int will be converted to a double
- java will convert the int to a double, which is called: implicit casting(automatic casting)
- and that will be no data loss because double can hold the int value

### explicit casting

what if we still wana y is an int?

```java
double x = 1.1;
int y = (int)x + 2; // explicit casting
```

- we add a parentheses and the type we want to cast to, in this case, int and we will have a data loss because we are converting a double to an int
- this is called explicit casting

#### This explicit casting only happens when we are converting compatible types

- x and y they all numbers so we can convert them to each other
- if x was a string, we can't convert it to an int

```java
String x = "1";
int y = (int)x + 2; // we have a compilation error
```

- so we can't convert a string to an int
- but for all this primitive types we have learned, we have wrappers classes for them in Java

```java
// so in Java we have a class called: Integer
Integer.parseInt(x); // this method will convert a string to an int

// or Short
Short.parseShort(x); // this method will convert a string to a short

// or Float
Float.parseFloat(x); // this method will convert a string to a float

```

```java
String x = "1.5";
double y = Double.parseDouble(x) + 2;
```

### Exercise 1

- use Integer.parseInt(x) and scanner write a program that allows the user to input a number and returns the square of that number

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }
}
```

### Exercise 2

- use Float.parseFloat(x); and scanner write a program that allows the user to input two numbers and returns the division of those numbers

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();
        float number1 = Float.parseFloat(input1);
        float number2 = Float.parseFloat(input2);
        float division = number1 / number2;
        System.out.println("The division of " + number1 + " and " + number2 + " is " + division);
    }
}
```

### Math class for performing mathematical operations

- Java has a built-in class called Math from Java.lang package

#### round()

- we can round a floating number to a whole number
- this Math.round() have two overloaded methods, one that takes a double and one that takes a float
- first implementation will take a double and return a long
- second implementation will take a float and return an int

```java
int result = Math.round(1.1F);
```

#### ceil()

- ceiling function, it will return the smallest integer that is greater than or equal to the argument

```java
double result = Math.ceil(1.1F); // 2.0
```

https://shorturl.at/2qmUw
