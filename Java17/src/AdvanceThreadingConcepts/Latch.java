package AdvanceThreadingConcepts;

import java.util.concurrent.CountDownLatch;

public class Latch {
	public static void main(String[] args) {
		int threadCount = 3;
		int round = 0;

		while (true) {
			round++;
			System.out.println("\n--- Round " + round + " started ---");

			CountDownLatch latch = new CountDownLatch(threadCount);

			for (int i = 1; i <= threadCount; i++) {
				int threadId = i;
				new Thread(() -> {
					try {
						System.out.println("Thread " + threadId + " is working...");
						Thread.sleep((long) (Math.random() * 1000));
						System.out.println("Thread " + threadId + " finished.");
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						latch.countDown();
					}
				}).start();
			}

			try {
				latch.await();
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted. Stopping...");
				break;
			}

			System.out.println("--- Round " + round + " completed ---");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				break;
			}
		}

		System.out.println("Program terminated.");
	}
}
