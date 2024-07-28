package GeeksforGeeksJava;

import java.util.Scanner;

public class SumOftheFirst {
    public static void main(String[] args) {

//        Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
//
//        Then calculates the sum of numbers from 1 to the entered integer, and displays the result on the screen.
//
//        Input example:
//
//        123
//        Output example:
//
//        7503

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result =0;

        for(int i =1; i<=num; i++){
            result += i;
        }

        System.out.println(result);


    }
}
