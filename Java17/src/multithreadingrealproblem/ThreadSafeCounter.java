package multithreadingrealproblem;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;

	}
}

public class ThreadSafeCounter {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});

		Thread t5 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		System.out.println("Final Counter = " + counter.getCount());
	}
}
