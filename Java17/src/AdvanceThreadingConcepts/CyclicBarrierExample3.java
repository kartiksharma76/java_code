package AdvanceThreadingConcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample3 {
	public static void main(String[] args) {
		int threadcount = 4;
		CyclicBarrier barrier = new CyclicBarrier(threadcount, () -> {
			System.out.println("\n== All workers completed  my work. Proceeding to next ==\n");
		});
		ExecutorService executor = Executors.newFixedThreadPool(threadcount);

		for (int i = 1; i <= threadcount; i++) {
			int id = i;

			executor.submit(() -> {
				try {
					// Phase 1
					System.out.println("Worker " + id + " starting  work 1");
					Thread.sleep(1000 + id * 200);
					System.out.println("Worker " + id + " finished work 1");
					barrier.await();

					// Phase 2
					System.out.println("Worker " + id + " starting work 2");
					Thread.sleep(1000 + id * 300);
					System.out.println("Worker " + id + " finished work 2");
					barrier.await();

					System.out.println("Worker " + id + " done with all work!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
		executor.shutdown();
	}
}
