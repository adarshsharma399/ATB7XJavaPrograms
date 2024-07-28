package ex_27072024;

public class Lab090 {
    public static void main(String[] args) {

        //StringBuilder, StringBuffer -> CLasses
        //StringBuilder and StringBuffer are mutable in nature, they can be changed and no new string will be created
        //It solves memory wastage problem

        String s1 ="Adarsh";
        s1 = "Sharma"; //stored as a new string

        StringBuffer fname = new StringBuffer("Adarsh ");
        fname.append("Sharma "); //AdarshSharma
        fname.append("Ji");

        System.out.println("fname: "+fname);

        StringBuilder first_name = new StringBuilder("Amit");
        first_name.append("Sharma");

        System.out.println("first_name: "+first_name);

        //What is the diff in these two?

        //Thread Safety

        //StringBuilder - Faster but non-synchronized
        //StringBuffer - Slower due to synchronization

        //We avoid Thread safety in Automation


        StringBuilder stringBuilder = new StringBuilder("Pramod");
        System.out.println(stringBuilder.reverse());


    }
}
