package Advancethreadingproblem;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierLambdaExample {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All Threads Reached Barrier"));

		Runnable task = () -> {

			try {

				System.out.println(Thread.currentThread().getName() + " waiting");

				barrier.await();

				System.out.println(Thread.currentThread().getName() + " crossed");

			} catch (Exception e) {

				e.printStackTrace();
			}
		};

		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
	}
}