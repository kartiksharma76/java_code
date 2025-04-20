package Locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdvanceLock {
	private int value = 10;
	//Object lock = new Object();
	ReentrantLock lock =new ReentrantLock();
	public void increment() {	  
		lock.lock();// more readable,More API
		try {
			value++;
			System.out.println(value);
			System.out.println(10/0);
		}
			finally {
				lock.unlock();
			}
			
	} 

	public static void main(String[] args) {
		AdvanceLock advancelock = new AdvanceLock();
		Runnable r = () -> {
			advancelock.increment();
		};
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			service.submit(r);
		}
//System.out.println(advancelock.lock.getHoldCount());
		service.shutdown();
	}
}
