package ex_14072024;

public class Lab013 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no;
        short s = (short)phone_no; //overflowed data gets into garbage collector
        System.out.println(s);


        int course = 100;
        float GST = 18.45f;
        //int total_price = course+GST; //implicit narrowing> Not allowed
        int total_price = course+(int)GST;

        System.out.println(total_price); //there is a loss of .45 with explicit narrowing


    }
}
