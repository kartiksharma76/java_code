package AdvanceThreading;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        ExecutorService gameStartService = Executors.newFixedThreadPool(1);
        Runnable mixedDoubleTensionGameStart = () -> {
            System.out.println("All 4 players ready, game starts, best of luck...");
        };
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, mixedDoubleTensionGameStart);
        Runnable player = () -> {
            System.out.println("Player " + Thread.currentThread().getName() + " is ready");
            try {
                cyclicBarrier.await(2, TimeUnit.SECONDS);
            } catch (InterruptedException | TimeoutException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(4);
        while (true) {
            for (int i = 1; i <= 4; i++) {
                service.submit(player);
            }
        }

    }
}
