## Lesson 3

### Tetris game

- last week we created a simple Tetris game with a square block in the center of the window

### Content today

#### formating numbers

- we want add a $ sign and separate the thousands with a comma
- or we might have a number like 0.1, we wana display it as a percentage value
- we have this class called NumberFormat that can help us with this
- in this class we have alot classes for handling text date and numbers so on
- we want to declar a variable of type NumberFormat, first give it a name
- we will see a error after the 'new NumberFormat' because it is an abstract class
- in Java we have this abstract classes that we can't create an object from
- they basicly like a half-baked cake, so we can not use a new operator to create an object from it
- we have to use a class that extends this abstract class, but for now we just need to udnerstand that we can't create an object from it
- so there gona be a other way
- use dot operator and type 'getNumberInstance' and then a pair of parentheses
- when we call it, it will create a instance of a class that extends NumberFormat and return it
- this is what we call 'a factory method'
- we store it in a variable of type NumberFormat and give it a name
- call the dot operator on the variable and type 'format' and then a pair of parentheses
- pass a value to the parentheses, this is the number that we want to format
- it will return a string of this number and format it as a currency
- so we have to store it in a variable of type String

```java
public class Main {
    public static void main(String[] args) {
        // 123456789
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456789);
        System.out.println(result); // $123,456,789.00

        // 0.1
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2); // 10%
    }
}
```

### project

- after we learn those conecepts, we will create a project that will help us to understand them better
- I want u build a mortgage calculator
- when u run this program, it will ask u question
- first question is the principal or the amount of lone u want to get. Let's say u want to get a loan of 100000
- the second question is the annual interest rate. Let's say the annual interest rate is 3.92
- the third question is the period of the loan in years. Let's say the period of the loan is 30 years
- after u answer those questions, the program will calculate the mortgage and display it as a currency

#### Hint

- search formula for calculating mortgage, u can find it on wikihow.com its called 'Calculate Mortgage Payments'
- let's see how it works, mortgage = P _ r _ (1 + r)^n / ((1 + r)^n - 1)

```java
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        float monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = years * 12;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // two dcimal places in currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("Mortgage: " + result);
    }

}
```
