package MultiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws  InterruptedException {
//        TestThread testThread1 = new TestThread();
//        TestThread testThread2 = new TestThread();
//        testThread1.start();
//        testThread2.start();

//        TestRunnable testRunnable1 = new TestRunnable();
//        Thread thread3= new Thread(testRunnable1);
//        Thread thread4= new Thread(testRunnable1);
//
//        thread3.start();
//        Thread.sleep(10);
//        thread4.start();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                System.out.println("Thread " +
                        Thread.currentThread().getName() + " is running.");
            });
        }

        executor.shutdown();
    }
}
