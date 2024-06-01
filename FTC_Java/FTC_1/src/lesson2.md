## Lesson 2: Object-Oriented Programming (OOP)

- Object-oriented programming (OOP) is a programming paradigm that uses objects to model real-world entities.
- OOP is based on the concepts of classes and objects, which are used to define the properties and behaviors of entities.

### declear multiple variables in one line

- In Java, you can declare multiple variables of the same type in a single line.

```java
int x, y, z;
int a = 1, b = 2, c = 3;
```

### pass variables to other variables

- In Java, you can pass the value of one variable to another variable.

```java
int x = 10;
int y = x;
System.out.println(y); // 10
```

### primitive types and reference types

- In Java, there are two types of data types: primitive types and reference types.
- Primitive types are basic data types that store simple values, such as numbers and characters. eg: int, float, double, char, boolean
- Reference types are more complex data types that store references to objects in memory. eg: String, Array, Class

### primitive types

| Type    | Bytes | Range                                                   |
| ------- | ----- | ------------------------------------------------------- |
| byte    | 1     | -128 to 127                                             |
| short   | 2     | -32,768 to 32,767                                       |
| int     | 4     | -2,147,483,648 to 2,147,483,647                         |
| long    | 8     | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float   | 4     | 1.4E-45 to 3.4E+38                                      |
| double  | 8     | 4.9E-324 to 1.8E+308                                    |
| char    | 2     | 0 to 65,535                                             |
| boolean | 1     | true or false                                           |

### return type

- In Java, a method can have a return type, which specifies the type of value that the method returns.
- If a method does not return a value, its return type is void.

```java
returnType Name(){
    // code
}
```

- some functions can return a value, and some functions can return nothing.

### void

- void is a return type function that does not return any value.
- void is a reserved keyword in Java. It will show blue color in the editor.
- after void, the function name is written, make sure the name is proper and meaningful.

### classes and objects

- A class is a blueprint for creating objects, and it defines the properties and behaviors of the objects. eg: void sendEmail()
- clear the Purpose of the class, and the class name should
- inside the class, we can pass parameters use this parameter to initialize the class variables.

```java
void sendEmail(who is the receiver, what is the subject, what is the message){
    // code
}
```

### every Java program has a atleast one function

- that function is call main function.
- main is the entry point of the program.
- whenevr we run the program, the main function is called first, and inside the main function that executes the code.

### Class

- the main function is belongs to the class.
- class is a container that holds the code. it like products get managed in supermarket.
- a Java project, main function is contained in the Main class.
- every class and function in Java have a access modifier: public, private, protected, default.
- it determines if other classes can access the class or function
- most of the time, we use public access modifier. We put that in front of the class or function.(basic structure)

```java
// the class name have capital letter at the beginning, every word in the class name have capital letter at the beginning.
public class Main {
    // the function name have small letter at the beginning, every word in the function name have capital letter at the beginning.
    // also the name is called camel casele quation.
    public static void main(String[] args) {
        // code
    }
}
```

```java
public class Person {

    // class variables
    String name;
    int age;

    // class method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of the Person class
        Person person = new Person();

        // set the values of the object's properties
        person.name = "John";
        person.age = 25;

        // call the object's method
        person.displayInfo();
    }
}
```

### constructors

- A constructor is a special method that is used to initialize objects of a class.
- Constructors have the same name as the class and do not have a return type.

```java
public class Person {
    String name;
    int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of the Person class using the constructor
        Person person = new Person("John", 25);

        // call the object's method
        person.displayInfo();
    }
}
```

### inheritance

- Inheritance is a mechanism in OOP that allows a class to inherit properties and behaviors from another class.
- The class that inherits from another class is called a subclass, and the class that is inherited from is called a superclass.

```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}

Student student = new Student("John", 25, "Computer Science");
student.displayInfo();
```

### exercise

- Create a class called `Motor` with the following properties:

  - `direction` (String) # Clockwise Counterclockwise
  - `area` (String) # Front Back Left Right
  - `speed` (int) # 0-100
  - `isOn` (boolean) # true false
  - `isMoving` (boolean) # true false

```java
class Motor {
    String direction;
    String area;
    int speed;
    boolean isOn;
    boolean isMoving;
}
```

- Create a method in the `Motor` class called `displayInfo` that prints all the properties of the `Motor` object.

```java
public Class Motor {
    String direction;
    String area;
    int speed;
    boolean isOn;
    boolean isMoving;

    public void displayInfo() {
        System.out.println("Direction: " + direction);
        System.out.println("Area: " + area);
        System.out.println("Speed: " + speed);
        System.out.println("Is On: " + isOn);
        System.out.println("Is Moving: " + isMoving);
    }
}
```

- Create an object of the `Motor` class and set the values of the all properties.

```java
Motor motor = new Motor();
motor.direction = "Clockwise";
motor.area = "Front";
motor.speed = 50;
motor.isOn = true;
motor.isMoving = true;
```

- Call the `displayInfo` method on the object to print the values of the properties.

```java
motor.displayInfo();
// Output:

// Direction: Clockwise
// Area: Front
// Speed: 50
```
