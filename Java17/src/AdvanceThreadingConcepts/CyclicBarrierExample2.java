package AdvanceThreadingConcepts;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample2 {
	public static void main(String[] args) {
		int threadcount = 3;

		CyclicBarrier barrier = new CyclicBarrier(threadcount, () -> {
			System.out.println("All threads reached the barrier. Moving on...");
		});

		ExecutorService executor = Executors.newFixedThreadPool(threadcount);

		for (int i = 1; i <= threadcount; i++) {
			int id = i;
			executor.submit(() -> {
				try {
					System.out.println("Thread " + id + " is working...");
					Thread.sleep(1000 + id * 500);

					System.out.println("Thread " + id + " waiting at the barrier...");
					barrier.await();

					System.out.println("Thread " + id + " passed the barrier!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		executor.shutdown();
	}
}
