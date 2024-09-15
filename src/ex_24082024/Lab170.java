package ex_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab170 {
    public static void main(String[] args) {

        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(45);
        marks.add(56);
        marks.add(12);

        Collections.sort(marks); //natural sorting
        System.out.println(marks);


        ArrayList names = new ArrayList();
        names.add("Adarsh");
        names.add("Sharma");
        names.add("Amit");
        names.add("Ram");

        Collections.sort(names); //natural sorting based on first alphabet

        System.out.println(names);
    }
}
//239