package ex_20072024;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {

//        ✅ FizzBuzz Test:
//        Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number from 1 to 100: ");
//        int num = sc.nextInt();
//
//        if(num %3== 0 && num%5 == 0){
//            System.out.println("FizzBuzz");
//        }
//        else if (num%5 == 0) {
//            System.out.println("Buzz");
//        }
//        else if (num%3 == 0) {
//            System.out.println("Fizz");
//        }
//        else{
//            System.out.println("You have entered wrong number");
//        }

        for (int num=1; num<=100; num++){

            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            }
            else if (num%3==0) {
                System.out.println("Fizz");
            }
            else if (num%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }
        }

    }
}
