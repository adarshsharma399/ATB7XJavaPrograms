package ex_24082024;

import java.util.PriorityQueue;

public class Lab174 {
    public static void main(String[] args) {
        //Queue - will not be used in automation

        PriorityQueue pq = new PriorityQueue();
        pq.offer("20"); //same as add
        pq.add("10");
        pq.offer("30");
        pq.offer("21");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll()); //remove 1st element
        System.out.println(pq);
    }
}
