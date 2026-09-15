package DeadLockConcepts;

import java.util.concurrent.locks.ReentrantLock;

public class ExampleReentrantLock {
	private final ReentrantLock Lock = new ReentrantLock();

	public void outerLock() {
		Lock.lock();
		try {
			System.out.println("Outer method locked by " + Thread.currentThread().getName());
			innerMethod();
		} finally {
			Lock.unlock();
		}
	}

	public void innerMethod() {
		Lock.lock();
		try {
			System.out.println("Inner method locked by " + Thread.currentThread().getName());

		} finally {
			Lock.unlock();
		}

	}

	public static void main(String[] args) {
		ExampleReentrantLock lock = new ExampleReentrantLock();
		lock.outerLock();
	}
}
