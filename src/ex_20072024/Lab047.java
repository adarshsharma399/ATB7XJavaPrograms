package ex_20072024;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        //Program to find the largest among 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        if(num1> num2 && num1> num3){
            System.out.println("Num 1 is largest");
        }
        else if (num2> num1 && num2> num3){
            System.out.println("Num 2 is largest");
        }
        else {
            System.out.println("Number 3 is largest");
        }

    }
}
