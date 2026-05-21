package Advancethreadingproblem;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLambdaExample {

	static ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {

		Runnable task = () -> {

			lock.lock();

			try {

				for (int i = 1; i <= 5; i++) {

					System.out.println(Thread.currentThread().getName() + " : " + i);
				}

			} finally {

				lock.unlock();
			}
		};

		new Thread(task).start();
		new Thread(task).start();
	}
}