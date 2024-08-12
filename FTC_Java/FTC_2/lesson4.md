## Lesson 4

#### recape

- variables and concept
- primitive and reference types
- casting
- numbers strings and arrays
- read input

### Control flow

##### comparison operators

- lets jumping and get start, we gona start with comparison operators
- we use this operators to compare primitive values
- for examle our x and y = or !=

- declare a variable of type int and give it a name
- to see they equal or not

```java
int x = 1;
int y = 1;
System.out.println(x == y); // here we have two equal signs is equality operator
// remember the single equal sign is assignment operator
```

- we got a true, which is a boolean expression, expression is a piece of code that produce a value
- we also have != inequality operator
- <= less than or equal to
- > = greater than or equal to
- < less than
- > greater than

##### logical operators

- after we learned the boolean expressions, we gona learn logical operators
- that is for combine multiple boolean expressions

- declare a value called 'temperature' and give it a value 22
- declare a boolean variable called 'isWarm', itis for check the temperature is greater than 20 or less than 30

```java
int temperature = 22;
boolean isWarm = temperature > 20 && temperature < 30; // this is and operator in Java
System.out.println(isWarm); // true
```

- if one of the boolean expression is false, the whole expression is false(and '&&')
- we also have or operator
- if one of the boolean expression is true, the whole expression is true(or '||')
- we also have not operator
- if the boolean expression is true, the whole expression is false(not '!')

- a example, let's declare a variable called 'hasHighIncome' and give it a value true
- other boolean variable called 'hasGoodCredit' and give it a value true as well
- we building a application for processing loans we want to see if a new applicant is eligible for a loan or not
- se declare a boolean variable called 'isEligible' and if one of the boolean expression is true, the whole expression is true

```java
boolean hasHighIncome = true;
boolean hasGoodCredit = true;
boolean isEligible = hasHighIncome || hasGoodCredit;
System.out.println(isEligible); // true

// declare a variable called 'hasCriminalRecord' and give it a value false
// if one of the boolean expression is false, the whole expression is false
boolean hasCriminalRecord = false;
isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
```

##### if statements

- if in Java is so important, it is a control flow statement
- we can build programs that can make decisions based on certain conditions

- we have example, if temperature is greater than 30, we want to display a message 'It's a hot day'
- if it is less than 20, we want to display a message 'It's a cold day'
- otherwise, we want to display a message 'It's a beautiful day'

```java
int temperature = 32;
if (temperature > 30) {
    System.out.println("It's a hot day");
} else if (temperature < 20) {
    System.out.println("It's a cold day");
} else {
    System.out.println("It's a beautiful day");
}
```

#### Simplify if statements

- we can simplify this if statements
- declear a variable called 'income' and give it a value 120_000
- declare a variable called 'hasHighIncome' and give it a value true
- declare a variable called 'hasGoodCredit' and give it a value true

```java
int income = 120_000;
boolean hasHighIncome = true;
if (hasHighIncome || hasGoodCredit) {
    hasHighIncome = true;
}

// we can simplify this if statement
int income = 120_000;
boolean hasCriminalRecord = income > 100_000;
```

#### switch statements

- we gona write a program that check the role of current user and then print different messages based on the role
- declare a variable called 'role' and give it a value 'admin'

```java
String role = "admin";  // start with switch statement
switch (role) {         // a block of code that will be executed based on the value of a variable
    case "admin":       // case clause, if the value of the variable is 'admin', we gona execute this block of code
        System.out.println("You're an admin");
        break;          // break statement, it will exit the switch block
    case "moderator":   // other case clause, if the value of the variable is 'moderator', we gona execute this block of code
        System.out.println("You're a moderator");
        break;
    default:            // default clause, if the value of the variable is not 'admin' or 'moderator', we gona execute this block of code
        System.out.println("You're a guest");
}
```

### Exercise: FizzBuzz

- it is a interview question
- write a program that prints the numbers from 1 to 100
- we should enter a number if the number is divisible by 5, we should print 'Fizz'
- if the number is divisible by 3, we should print 'Buzz'
- if the number is divisible by both 3 and 5, we should print 'FizzBuzz'
- otherwise, we should print the number

```java
for (int i = 1; i <= 100; i++) {
    if (i % 5 == 0 && i % 3 == 0) {
        System.out.println("FizzBuzz");
    } else if (i % 5 == 0) {
        System.out.println("Fizz");
    } else if (i % 3 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(i);
    }
}
```

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

if (number % 5 == 0 && number % 3 == 0) {
    System.out.println("FizzBuzz");
} else if (number % 5 == 0) {
    System.out.println("Fizz");
} else if (number % 3 == 0) {
    System.out.println("Buzz");
} else {
    System.out.println(number);
}
```
