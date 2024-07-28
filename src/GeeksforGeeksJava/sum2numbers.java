package GeeksforGeeksJava;

import java.util.Scanner;

public class sum2numbers {
    public static void main(String[] args) {
        //Write a Program in Java to Add two Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers is: "+ (num1+num2));

    }
}
