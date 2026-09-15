package Advancethreadingproblem;

import java.util.concurrent.Semaphore;

public class SemaphoreLambdaExample {

	static Semaphore semaphore = new Semaphore(2);

	public static void main(String[] args) {

		Runnable task = () -> {

			try {

				semaphore.acquire();

				System.out.println(Thread.currentThread().getName() + " using resource");

				Thread.sleep(2000);

			} catch (Exception e) {

				e.printStackTrace();

			} finally {

				semaphore.release();
			}
		};

		for (int i = 1; i <= 5; i++) {

			new Thread(task).start();
		}
	}
}