package ex_13072024;

import java.sql.SQLOutput;

public class Lab005 {
    public static void main(String[] args) {

        byte b = 127;
        //b = b+1;       //out of bound issue
        System.out.println(b);

        int _123 = 987;   //variable can start with _ and $
        System.out.println(_123);

        //Formatting

        int age = 19;
        System.out.println("Your age is:" + age);  //concatenation

//Format Specifiers
        // %d : Any integer
        // %s : String
        // %c : char
        // %f : float

        System.out.printf("Your age is: %d", age); //Replacement



        String s1 = "Adarsh";
        String s2 = "Sharma";

        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;

        System.out.println(x+y);
        System.out.println(x+s3);
        System.out.println(x+y+s3);  //199Amit
        System.out.println(s3+x+y);  //Amit99100
        System.out.println(x+s3+y);  //99Amit100

        System.out.println(x+y+s3+y+s3+x+y);

        int n = 9;
        System.out.printf("%d\n",n);

        int a = 10;
        int b1 = 20;

        System.out.printf("sum2numbers is: %d\n", (a + b1));

        int num = 42;
        String text = "Hello, World!";
        char letter = 'A';
        float pi = 3.14f;

        System.out.printf("Integer:%d\n", num);    //%d is format specifier and \n is escape character
        System.out.printf("String: %s\n", text);
        System.out.printf("Character: %c\n", letter);
        System.out.printf("Float: %f\n", pi);

    }
}
