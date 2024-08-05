// - after we learn those conecepts, we will create a project that will help us to understand them better
// - I want u build a mortgage calculator
// - when u run this program, it will ask u question
// - first question is the principal or the amount of lone u want to get. Let's say u want to get a loan of 100000
// - the second question is the annual interest rate. Let's say the annual interest rate is 3.92
// - the third question is the period of the loan in years. Let's say the period of the loan is 30 years
// - after u answer those questions, the program will calculate the mortgage and display it as a currency

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
