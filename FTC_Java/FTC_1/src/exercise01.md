## Exercise 1:

- Declare an integer variable a with the value 10, a double variable b with the value 3.14, and a boolean variable isJavaFun with the value true. Print these variables.

```java
public class VariablePractice {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        boolean isJavaFun = true;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("isJavaFun: " + isJavaFun);
    }
}
```

## Exercise 2:

- Declare an integer variable number with the value 7. Use an if-else statement to check if this number is even or odd, and print a message.

  ```java
  public class IfElsePractice {
    public static void main(String[] args) {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
  }
  ```

## Exercise 3:

- Use a for loop to print the numbers from 1 to 10.
  ```java
  public class ForLoopPractice {
   public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
              System.out.println(i);
        }
   }
  }
  ```

## Exercise 4:

- Use a while loop to calculate and print the sum of numbers from 1 to 5.

  ```java
  public class WhileLoopPractice {
      public static void main(String[] args) {
          int i = 1;
          int sum = 0;

          while (i <= 5) {
              sum += i;
              i++;
          }

          System.out.println("Sum: " + sum);
      }
  }
  ```

## Object-Oriented Programming (OOP)

## Exercise 5:

- Create a Person class with name and age attributes. Write a constructor for this class and a method displayInfo to print the information. In the main method, create a Person object and call displayInfo.

  ```java
    class Person {
      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      void displayInfo() {
          System.out.println("Name: " + name + ", Age: " + age);
      }
  }

  public class PersonTest {
      public static void main(String[] args) {
          Person person = new Person("Alice", 25);
          person.displayInfo();
      }
  }

  ```

## Exercise 6:

- Create an array of integers and print its elements.

```java
public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

## Exercise 7:

- Create an ArrayList, add three strings to it, and print them.

```java
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
```
