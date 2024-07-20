package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab029 {
    public static void main(String[] args) {

        //Take a user input and check if number is odd or even

        //Logic Building
        //1. Figure out the inputs, Data type
        //Datatype - int
        //How to take input in java? Scanner Class
        //nextInt() -> Input

        //2. Do we need conversion or direct
        //3. Rough Logic
        //4. Optimize


        Scanner sc = new Scanner(System.in);    //creation of the object of scanner class  //Helping us to take a input
        System.out.println("Enter the number: ");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if (user_input%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
