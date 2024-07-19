package ex_14072024;

public class Lab014 {
    public static void main(String[] args) {
        //Increment (++) and Decrement (--) operators

        //Pre - increment: value is incremented first and then stored in the result.

        int a = 10;
        int b = ++a; //a = a+1;
        // b = 11, a = 11
        System.out.println(a);
        System.out.println(b);


        int a1 = 10;
        System.out.println(++a1);

        //Pre - increment: value is stored in the result first and incremented later.
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
