package ex_20072024;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {

//   ✅ Leap Year Program - 2024 : A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to check if it is Leap Year or not: ");
        int year = sc.nextInt();

        if(year%4 == 0 && year%100 != 0 || year%400 ==0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }

    }
}
