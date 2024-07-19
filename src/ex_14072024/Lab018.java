package ex_14072024;

public class Lab018 {
    public static void main(String[] args) {

        String name = "Adarsh";

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0)); //char at what index

        //SCP and Heap - JVM

        //JVM- class loader- loads class, heap- here they load objects, string constant pool

        String name1 = "Adarsh"; //stored in string constant pool
        //String - Collection of characters, it is a final class
        //class - ?

        String name2 = new String("Adarsh"); //stored in heap

        //2 ways to store a string- 2
        // =, new operator
        // = "SCP"
        // new - Objects(heap)

        //Strings are immutable in nature

    }
}
