package javapractice2026;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLockAvoide {
	static ReentrantLock lock1 = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();

	public static void main(String[] args) {
		if (lock1.tryLock()) {
			try {
				if (lock2.tryLock()) {
					try {
						System.out.println("Both locks acquired safely");
					} finally {
						lock2.unlock();
					}
				}
			} finally {
				lock1.unlock();
			}
		}
	}

}
