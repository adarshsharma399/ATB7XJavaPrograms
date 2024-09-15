package MultiThreading;

public class Lab184 {

    public static void main(String[] args) {
        //Task 1 - Go from 1 to 5 -> Assigned to Worker 1 class
        //Task 2 - Go from 1 to 100 -> Assigned to Worker 2 class

        ThreadGroup threadGroup = new ThreadGroup("Workers");

        WorkerLab184 w1 = new WorkerLab184(threadGroup, "W1"); //Thread in New state
        w1.start();  //worker 1 thread

        WorkerLab184 w2 = new WorkerLab184(threadGroup, "W2");
        w2.start();  //worker 2 thread

        //Main thread
        for(int i = 0; i<5; i++){ //main is also doing some work -> main thread
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

}


//By Extending Thread Class
 class WorkerLab184 extends Thread {

    WorkerLab184(ThreadGroup threadGroup, String name){//constructor
        super(threadGroup,name);
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}


//Both worker threads and main threads are executed
//Thread-0
//Thread-1
//main
//Thread-0
//Thread-1
//main
//Thread-1
//Thread-0
//main
//Thread-1
//main
//Thread-0
//main
//Thread-1
//Thread-0