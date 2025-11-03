package litcode;

public class DeadlockExample {
	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock1...");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock2...");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock2...");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock1...");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
