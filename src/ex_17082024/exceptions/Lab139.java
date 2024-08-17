package ex_17082024.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab139 {
    public static void main(String[] args) {
//        //Exception -> Two Types
//        // 1. Checked -> JVM knows
//        try {
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        // 2. Unchecked ->JVM doesn't know (Runtime exception)
        int a = 10;
        try {
            int c = a/0;   // java.lang.ArithmeticException
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("/ by zero");
        }
        System.out.println("End of Program");

    }
}
