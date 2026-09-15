package DeadLockConcepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AvoideDeadLock {
	static ReentrantLock lock1 = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				if (lock1.tryLock(1, TimeUnit.SECONDS)) {
					System.out.println("Thread-1 acquired lock1");
					Thread.sleep(500);
					if (lock2.tryLock(1, TimeUnit.SECONDS)) {
						System.out.println("Thread-1 acquired lock2");
						lock2.unlock();
					}
					lock1.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				if (lock2.tryLock(1, TimeUnit.SECONDS)) {
					System.out.println("Thread-2 acquired lock2");
					Thread.sleep(500);
					if (lock1.tryLock(1, TimeUnit.SECONDS)) {
						System.out.println("Thread-2 acquired lock1");
						lock1.unlock();
					}
					lock2.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
	}
}
