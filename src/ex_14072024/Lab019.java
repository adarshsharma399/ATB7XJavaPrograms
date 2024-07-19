package ex_14072024;

public class Lab019 {
    public static void main(String[] args) {
        String s1 = "Adarsh";
        //1 , SCP
        s1 = "Amit";
        //2, SCP
        s1= "Dutta";
        //3, SCP
        s1= "Adarsh";
        //3, SCP (string constant pool)

        String s2 = new String("Adarsh");
        String s3 = new String("Sharma");
        //2 , heap
    }
}
