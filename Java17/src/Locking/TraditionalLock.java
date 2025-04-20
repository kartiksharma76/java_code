package Locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// simple to use
public class TraditionalLock {
	private int value = 10;
Object lock =new Object();
	public void increment() {//not readilblity ,less API
		synchronized (lock) {// this and object are same behavior but object is more flexible
			value++;
			System.out.println(value);
		}

	}

	public static void main(String[] args) {
		TraditionalLock lock = new TraditionalLock();
		Runnable r = () -> {
			lock.increment();
		};
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			service.submit(r);
		}

		service.shutdown();
	}
}
