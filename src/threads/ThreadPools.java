package threads;

import java.util.concurrent.*;

public class ThreadPools {
    public void example() {
        int threadCount = Runtime.getRuntime().availableProcessors();
        int numberOfTasks = 100;

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < numberOfTasks; i++) {
            int finalI = i;
            threadPool
                    .submit(() -> {
                        System.out.println("Task " + finalI + " started " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }

        threadPool.shutdown();
    }
}
