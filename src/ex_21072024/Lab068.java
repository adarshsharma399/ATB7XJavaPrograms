package ex_21072024;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        //Coding Program - Factorial Program
        // 5= 5*4**3*2*1 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);

        sc.close();

    }

}
