## lesson 3

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

### Data types with different pakages

- same class name can be used in different packages.

  ![Alt text](image.png)

- eg: `java.util.Date` and `java.sql.Date`
- after we choose the package, VSCode will automatically import the package.
- we will talk about packages in the future.

now we have Date variable in java.util package, let's give it a name like: now
we set this here we need to use 'new' operator to allocate memory for this variable.

- this is a difference between primitive types and reference types.
- when declaring a primitive type, we just need to declare the type and the name of the variable.
  don't need to allocate memory for it.
- Java runtime environment will automatically allocate memory for it.
- when declaring a reference type, we need always to use 'new' operator to allocate memory for it.
- we don't have to release memory for it, Java runtime environment will automatically take care of it.

```java
// after 'new' we need repeat the name of the class then we need add parentheses followed by a semicolon.
Data now = new Date();

// the now variable we defined is an instance of the Date class.

// if Object or class have member variables, we can use the dot operator to access them.
now.getTime();

// primitive types don't have member variables.
// if using dot operator on primitive types u wont see any member variables.


```

#### exercise

print now date and time.

```java
import java.util.Date;

public class lesson3 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
    }
}
```
