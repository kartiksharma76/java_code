package Advancethreadingproblem;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchLambdaExample {

	public static void main(String[] args) throws Exception {

		CountDownLatch latch = new CountDownLatch(3);

		Runnable task = () -> {

			System.out.println(Thread.currentThread().getName() + " completed");

			latch.countDown();
		};

		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();

		latch.await();

		System.out.println("All Tasks Finished");
	}
}