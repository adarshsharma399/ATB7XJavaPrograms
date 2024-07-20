package ex_20072024;

public class Lab040 {
    public static void main(String[] args) {

        int itemcode = 010;
        switch (itemcode){
            case 001,002,003:
                System.out.println("Kt is Electronic Gadget");
                break;
            case 004,005,007:
                System.out.println("Kt is Mechanical Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
