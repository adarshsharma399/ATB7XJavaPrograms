package ex_17082024.exceptions;

public class Lab141 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {  //This catch block is designed to handle three specific exceptions: ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
    //212
