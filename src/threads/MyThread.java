package threads;

public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("MyThread is running");
        try {
            syncExample(Thread.currentThread().getName());
            syncExample2(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void syncExample(String name) throws InterruptedException {
        System.out.println("syncExample: " + name);
        Thread.sleep(1000);
    }

    public void syncExample2(String name) throws InterruptedException {
        synchronized (this) {
            System.out.println("syncExample2: " + name);
            Thread.sleep(1000);
        }
    }
}
