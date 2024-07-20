package ex_20072024;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {

        //✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        //determine if the triangle is equilateral (all sides are equal),
        //isosceles (exactly two sides are equal), or scalene (no sides are equal).
        //Use an if-else statement to classify the triangle.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("Triangle is Equilateral");
        }
        else if (num1 == num2 || num1 == num3 || num2 ==num3  ){
            System.out.println("Isoceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
