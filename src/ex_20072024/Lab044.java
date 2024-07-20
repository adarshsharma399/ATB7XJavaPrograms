package ex_20072024;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        //Write a program name, age, salary -print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Your name is: "+ name);
        System.out.println("Your name is: "+ age);
        System.out.println("Your name is: "+ salary);

        sc.close();
    }
}
