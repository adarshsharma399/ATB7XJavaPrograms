package ex_18082024.CollectionFramework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Lab159 {
    public static void main(String[] args) {
        //Collection Framework

        //Collection Interface
        //Collection(I) -> List (I)
        //List (I) -> ArrayList, LinkedList, Vector, Stack

        //List is like your Shopping list, Marks list,Collection of Items, To Do list etc...

        List myList = new ArrayList(10);  //Dynamic Dispatch -> Father reference with ArrayList
        ArrayList myList2 = new ArrayList();

        Collection myList3 = new ArrayList();  //Granfather reference with ArrayList

        ArrayList myList4 = new ArrayList(); //We have not given any size, we can add n number of strings
        myList4.add("Adarsh");
        myList4.add("Sharma");
        myList4.add("Prateek");
        myList4.add("Pramod");
        myList4.add("Dutta");
        myList4.add("Lucky");
        myList4.add(123); //We can add heterogeneous Data

        System.out.println(myList4);
        System.out.println(myList4.size());
        System.out.println(myList4.contains("Adarsh")); //true
        System.out.println(myList4.contains("Jatin")); //false

        String s1 = (String) myList4.get(1); //casted to string
        System.out.println(s1); //Sharma






    }
}


//228