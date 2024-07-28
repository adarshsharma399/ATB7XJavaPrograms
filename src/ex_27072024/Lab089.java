package ex_27072024;

public class Lab089 {
    public static void main(String[] args) {

        //String - Bunch of characters

        String s1 = new String("Adarsh"); //Heap Area
        String s2 = "Sharma"; //String constant pool

        //String - Immutable in nature

        System.out.println(s1.length());
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());

    }
}
