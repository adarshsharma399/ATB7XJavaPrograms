package ex_20072024;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a','A':
                System.out.println("Vowel");
                break;
            case 'e','E':
                System.out.println("Vowel");
                break;
            case 'i','I':
                System.out.println("Vowel");
                break;
            case 'o','O':
                System.out.println("Vowel");
                break;
            case 'u','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }

        switch (user_input){
            case 'a','i','o','u','e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
    }
}