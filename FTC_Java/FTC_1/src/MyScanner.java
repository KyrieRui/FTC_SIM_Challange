// import java.util.Scanner;

// public class MyScanner {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please input a double number: ");
//         double d = sc.nextDouble();
//         int i = (int) d;
//         double decimal = d - i;
//         System.out.println("The decimal part of the double number is: " + decimal);
//     }
// }

import java.util.Scanner; 

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }
}