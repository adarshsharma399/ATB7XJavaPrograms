package ex_17082024.finallyKeyword;

public class Lab147 {

    public static void main(String[] amit) {

        try {
            int a = 10/0;
        } catch (Exception pramod) {
            System.out.println("Div by Zero");
            //pramod.getMessage()
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }
    }
}

    //216

    //ArithmeticException -> Exception -> Throwable (Bigger basket)
