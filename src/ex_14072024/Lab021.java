package ex_14072024;

public class Lab021 {
    public static void main(String[] args) {
        String s1 = new String("Adarsh");
        String s2 = new String("Adarsh");
        String s3 = new String("Adarsh");

        System.out.println(s1 == s2); //check for the reference
        System.out.println(s2 == s3); //check for the reference
        System.out.println(s2.equals(s3)); //check for the content

        String s4 = "Adarsh";
       //            012345
        char c = s4.charAt(5);
        //s4.concat("Sharma"); //we aren't storing the value
        System.out.println(s4); //output will be- Adarsh
        s4 = s4.concat("Sharma");
        System.out.println(s4); //output will be- AdarshSharma
    }
}
