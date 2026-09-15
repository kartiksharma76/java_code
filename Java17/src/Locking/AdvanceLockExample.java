package Locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class AdvanceLockExample {
	private int capacity = 10;
	// Object lock=new Object();
	ReentrantLock lock = new ReentrantLock();

	public void incremanet() {
		lock.lock();
		try {
			capacity++;
			System.out.println(capacity);
			System.out.println(10 / 0);
		} finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {
		AdvanceLockExample advanceLock = new AdvanceLockExample();
		Runnable K = () -> {
			advanceLock.incremanet();
		};
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			service.submit(K);
		}
		// System.out.println(advanceLock.lock.getHoldCount());
		service.shutdown();
	}
}
