package ex_24082024;

import java.util.*;

public class Lab173 {
    public static void main(String[] args) {

        //List -> Allows Duplicate
        //Set -> Doesn't allow Duplicate

        Set hs = new HashSet();  //Hashing mechanism to store the element, There is no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet();  //LinkedList mechanism to store the element. Order will be maintained.
        lhs.add("Apple");
        lhs.add("Apple"); //it will not take duplicate
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();  //Black and Red Tree mechanism to store the element. Automatic Sort.
        ts.add("Apple");
        ts.add("Apple"); //it will not take duplicate
        ts.add("apple");
        ts.add("Orange");
        //ts.add(null); //TreeSet does the sorting and sorting with null is not possible, it will throw error.
        System.out.println(ts);



        for(Object s: ts){
            System.out.println(ts);
        }

        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
