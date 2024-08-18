package ex_18082024;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (name.equalsIgnoreCase("Pramod")){
            try {
                throw new Exception("Not allowed!!");
            } catch (Exception e) {
                System.out.println("Exception!!");
            }
        }else {
            System.out.println("Allowed!");
        }
    }
}
//223

//throw is used to basically create the exception
//throws is used to handle the exception