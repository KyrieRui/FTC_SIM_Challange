## lesson 4

### 1. back slash

- back slash is used to escape special characters in a string.
- back slash is used to escape double quotes in a string.
- back slash is used to escape single quotes in a string.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello \"World\"");
        System.out.println("Hello \'World\'");
        System.out.println("Hello \\World\\");
    }
}
```

#### exercise 1

- create a message containing the following text:
  - C: Windows\...
- use the escape character to print the message.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("C:\tWindows\\...");
    }
}
```

### Array

- the array in Java use for storing multiple values in a single variable. for example list or numbers of list of people or list of messages.

```java
public class Main {
    public static void main(String[] args) {
        // we have a integer variable 'number'
        int number = 10;

        // convert the integer variable to an array

        // right at the 'int' we add a square bracket '[]'
        int[] number = 10;

        // u gona see an error because we can't assign an integer to an array


        // to fix this we need to remove 10.


        // the int array is a reference type, so we need to use the 'new' operator to create an array
        int[] number = new int[5]; // inside the square bracket we specify the length of the array

        // also change the name of ur variable to 'numbers'
        int[] numbers = new int[5];


        // to access the element of the array we use the index of the element

        numbers[0] = 10; // syntax: array[index] = value;

        // same we can set the value of the other elements
        // to complete the array we need to set the value of the other elements


    }
}
```

- what if we use the index that is not in the array?

```java
public class Main {
    public static void main(String[] args) {
        // creating an array
        int[] numbers = new int[5];

        // initializing the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // if we use the index that is not in the array we will get an error
        numbers[5] = 60;

        // when we run the code we will get an Exception
    }
}
```

#### exercise 2

- create an array of 5 elements and set the value of the 1th and 2th element to 10 and 20, then print numbers.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(numbers);

        // we will get an output like this: [I@1b6d3586

        // reson is when we print array, Java return this string which is calculated based on the address of the array in memory.

        // so if u have other array and print it, u will get the something different.

        // because each object in Java has a unique address in memory.

        // how can we see the actual item of the array?

        // we have Class in Java call: Arrays

        // like we do last week, we need to import the Arrays class from 'java.util' package

        Arrays // follow by a dot operator to see different methods of the Arrays class

        // we have a method call 'toString' which return the string representation of the array
        Arrays.toString(numbers);

        // we will see multiple time of 'toString' method in Java, take care of their difference. That we called 'method overloading'
    }
}
```

#### exercise 3

- create an array of 5 elements and set the value of the 1th and 2th element to 10 and 20, then print numbers.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(Arrays.toString(numbers));
    }
}
```

- try to create an array of 5 elements and set the value of the 1th and 2th element to
  'ture' and 'false', then print numbers.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean[] numbers = new boolean[5];

        numbers[0] = true;
        numbers[1] = false;

        System.out.println(Arrays.toString(numbers));
    }
}
```

### creat array without 'new' operator

- we can create an array without using the 'new' operator.

```java
public class Main {
    public static void main(String[] args) {
        // we can create an array without using the 'new' operator
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(numbers));
    }
}
```

- try to use dot operator to access the length of the array.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 1, 4};


        numbers.length // here we can see a 'f' in front of the 'length' which means it's a field not a method, and type of field is 'int'

        // field is like a variable of a class
        System.out.println(numbers.length);
    }
}
```

- in Java, the array is a fixed size, so we can't change the size of the array. we have fixed length.

- if we want to change the size of the array, u should use one of the collection classes in Java. which we talk about it later.

### sort array

- now we can see our numbers are not sorted, so we can use the 'sort' method of the 'Arrays' class to sort the array.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 1, 4};

        // sort is a static method of the Arrays class remember the name of the class is Capitalized
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
```

#### exercise 4

- create an array {100, 60, 70, 80, 90} and sort the array.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {100, 60, 70, 80, 90};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
```

### multi-dimensional array

- we now know array can store multiple values in a single variable, but what if we want to store multiple arrays in a single variable?
- in Java, we can create a multi-dimensional array.
- we can create a 2 dimensional array to store data like a cube.

```java
public class Main {
    public static void main(String[] args) {
        // we can create a array
        int[] numbers = new int[3];

        // to create a 2 dimensional array we need to add another square bracket
        int[][] numbers = new int[3][3];

        // let's creat  a 2 by 3 array, which means 2 rows and 3 columns
        int[][] numbers = new int[2][3];

        // to access the element we need to use 2 index

        // first index is the row index
        // second index is the column index

        // to set the value of the first element
        numbers[0][0] = 1;

        // print it
        System.out.println(Arrays.toString(numbers));

        // once again we saw some memory address, so we need to use the 'Arrays' class to print the actual value of the array

        // because the 'toString' method of the 'Arrays' class is overloaded, we can use it to print the multi-dimensional array
        System.out.println(Arrays.deepToString(numbers));

        // now we have the matrix printed in the console
        // we have 2 rows and each row has 3 columns
    }
}

```

#### exercise 5

- try to use bracket to create a 2-dimensional array, without useing new operator.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(numbers));
    }
}
```
