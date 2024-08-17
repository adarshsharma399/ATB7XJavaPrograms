package ex_17082024.exceptions;

public class Lab138 {
    public static void main(String[] args) {
        String ip = args[0];  //ArrayIndexOutofBoundsException -> when nothing is passed

        int a = Integer.parseInt(ip); //String converted to Integer  //NumberFormatException -> string as input

        int b = 1000/a;  //ArithmeticException ->divided by 0

        System.out.println(a);
        System.out.println(b);

        //System.out.println(ip);


        //Steps:
        //JVM is initialized
        //created and starts main thread- main called
        //collects the command line argument
        //creates the string array with CLI
        //Lab138.main(0)
        //Now control will be transferred from main thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.

        //209

    }
}
