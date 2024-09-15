package ex_24082024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab177 {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        //Map
        //null
        //Synchronised, thread safe
        //Slow
        //Legacy class - will not be used

        ht1.put(1, "one");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }

    }
}
//246