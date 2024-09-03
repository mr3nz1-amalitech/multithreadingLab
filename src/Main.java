import threads.Bank;
import threads.MyThread;
import threads.MyThread2;
import threads.ThreadPools;

public class Main {


    public static void main(String[] args) {
        try {
            Bank bank = new Bank();
//        example of synchronization and thread creation
            MyThread t1 = new MyThread(bank);
            MyThread t2 = new MyThread(bank);

            t1.start();
            t2.start();
//
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(bank.money);


//example of thead pools
//        ThreadPools threadPools = new ThreadPools();
//        threadPools.example();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}