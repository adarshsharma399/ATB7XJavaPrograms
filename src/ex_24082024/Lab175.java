package ex_24082024;

import java.util.*;

public class Lab175 {
    public static void main(String[] args) {
        //Map - Key and Value Pair
        //name: Pramod, roll:31, Phone:9749799999

        Map m1 = new HashMap();  //Dynamic dispatch
        //Map m1 = new LinkedHashMap();
        //Map m1 = new WeakHashMap();
        //Map m1 = new TreeMap();
        m1.put("name","Pramod");
        m1.put("rollNo",5);
        m1.put("phone", 1987577586);
        System.out.println("HashMap = "+ m1);  //No order


        Map m2 = new LinkedHashMap();
        //Map m1 = new WeakHashMap();
        //Map m1 = new TreeMap();
        m2.put("name","Pramod");
        m2.put("rollNo",5);
        m2.put("phone", 1987577586);
        System.out.println("LinkedHashMap = "+ m2);


        Map m3 = new WeakHashMap();
        //Map m1 = new TreeMap();
        m3.put("name","Pramod");
        m3.put("rollNo",5);
        m3.put("phone", 1987577586);
        System.out.println("WeakHashMap = "+ m3);


        Map m4 = new TreeMap();
        m4.put("name","Pramod");
        m4.put("rollNo",5);
        m4.put("phone", 1987577586);
        System.out.println("TreeMap = "+ m4);

    }
}
