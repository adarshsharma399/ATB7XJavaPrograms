package ex_24082024;

import java.util.Stack;

public class Lab168 {
    public static void main(String[] args) {
        //Stack- Legacy Class- 95% of time we are not going to use it in automation


        Stack s = new Stack();
        s.add("Pramod");
        s.add("Dutta");
        s.add("Adarsh");

        s.push("Amit");  //push and add here is same

        System.out.println(s);
        System.out.println(s.peek()); //last element

        System.out.println(s.pop());
        System.out.println(s);



    }
}
