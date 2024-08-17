package ex_17082024.exceptions;

public class Lab140 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("/ by zero");
        }
        System.out.println(c);
        System.out.println("End");
    }
}
