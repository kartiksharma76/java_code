package trenningjava;

public class ThreadLifeCycleDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			try {
				System.out.println("Thread is running....");
				Thread.sleep(2000);
				System.out.println("Thread finished work.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		System.out.println("State after creation: " + t1.getState());
		t1.start();
		System.out.println("State after start(): " + t1.getState());

		// Give thread time to enter sleep()
		Thread.sleep(500);
		System.out.println("State during sleep(): " + t1.getState());

		// Wait for thread to finish
		t1.join();

		// TERMINATED
		System.out.println("State after completion: " + t1.getState());
	}
}
