package Locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TradintionalLockExample {
	private int capacity = 10;
	Object lock = new Object();

	public void increment() {
		synchronized (lock) {
			capacity++;
			System.out.println(capacity);
		}
	}

	public static void main(String[] args) {
		TraditionalLock lock = new TraditionalLock();
		Runnable K = () -> {
			lock.increment();
		};
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			service.submit(K);
		}
		service.shutdown();
	}
}
