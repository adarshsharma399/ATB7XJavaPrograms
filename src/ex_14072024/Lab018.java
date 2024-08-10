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

        //String Literal (name1): Stored in the string constant pool. Efficient in terms of memory usage and performance due to reusability.

        String name2 = new String("Adarsh"); //stored in heap

        //String Object (name2): Stored in the heap. A new String instance is created every time new String("Adarsh") is called, regardless of the pool.



        //2 ways to store a string- 2
        // =, new operator
        // = "SCP"
        // new - Objects(heap)

        //Strings are immutable in nature

    }
}
