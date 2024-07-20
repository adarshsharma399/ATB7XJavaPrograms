package ex_20072024;

public class Lab041 {

    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 003;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");   // if we don't want to use break, we can use ->
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }



}
