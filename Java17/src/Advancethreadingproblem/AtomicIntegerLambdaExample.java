package Advancethreadingproblem;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerLambdaExample {

	static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws Exception {

		Runnable task = () -> {

			for (int i = 1; i <= 1000; i++) {

				count.incrementAndGet();
			}
		};

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Count : " + count);
	}
}