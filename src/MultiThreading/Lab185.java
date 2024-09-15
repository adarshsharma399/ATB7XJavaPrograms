package MultiThreading;

public class Lab185 {
    public static void main(String[] args) {

        Runnable w1 = new WorkerLab185();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new WorkerLab185();
        Thread t2 = new Thread(w2);
        t2.start();          //why calling start() method instead of run()?
        t2.setPriority(7);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "----" + Thread.currentThread().getName());
        }
    }


    //Thread By implementing Runnable Interface
    static class WorkerLab185 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

//why calling start() method instead of run()? - line 8 and 12
//No separate thread will not be created by JVM if run() method is used.
//Start method is is calling the run() method behind the scene.
