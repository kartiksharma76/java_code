package Advancethreadingproblem;

import java.util.concurrent.locks.*;

public class ReadWriteLockLambdaExample {

	static int value = 10;

	static ReadWriteLock lock = new ReentrantReadWriteLock();

	public static void main(String[] args) {

		Runnable readTask = () -> {

			lock.readLock().lock();

			try {

				System.out.println("Reading : " + value);

			} finally {

				lock.readLock().unlock();
			}
		};

		Runnable writeTask = () -> {

			lock.writeLock().lock();

			try {

				value = 50;

				System.out.println("Writing : " + value);

			} finally {

				lock.writeLock().unlock();
			}
		};

		new Thread(readTask).start();

		new Thread(writeTask).start();
	}
}