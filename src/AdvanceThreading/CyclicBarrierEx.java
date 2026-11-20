package AdvanceThreading;


import java.util.concurrent.*;

public class CyclicBarrierEx {

    public static void main(String[] args) {

        Runnable allTasksCompleted = () -> {
            System.out.println("All workers completed! Next phase started.");
        };

        CyclicBarrier barrier = new CyclicBarrier(4, allTasksCompleted);

        Runnable worker = () -> {

            System.out.println("Worker: " + Thread.currentThread().getName() + " is working");

            try {
                Thread.sleep(1000);

                System.out.println("Worker ready: " + Thread.currentThread().getName());

                barrier.await(2, TimeUnit.SECONDS);

            } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {

                e.printStackTrace();
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 4; i++) {
            service.submit(worker);
        }

        service.shutdown();
    }
}
