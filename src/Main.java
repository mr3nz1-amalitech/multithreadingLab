import threads.MyThread;
import threads.MyThread2;
import threads.ThreadPools;

public class Main {
    public static void main(String[] args) {
//        example of synchronization and thread creation
        MyThread myThread = new MyThread();
        MyThread otherThread = new MyThread();

        myThread.start();
        otherThread.start();


//example of thead pools
//        ThreadPools threadPools = new ThreadPools();
//        threadPools.example();
    }
}