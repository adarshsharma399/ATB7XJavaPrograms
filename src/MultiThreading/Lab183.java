package MultiThreading;

public class Lab183 {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + i + "-" + t.getThreadGroup() + "-" + t.getPriority());

        }

    }
}


//Main Thread
//Garbage Collector Thread
//Finalizer Thread - Closes the Program