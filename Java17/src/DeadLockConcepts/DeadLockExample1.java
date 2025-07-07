package DeadLockConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockExample1 {
	public static final Object R1 = new Object();
	public static final Object R2 = new Object();
	public static final Object R3 = new Object();

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		Runnable P1 = new Thread(() -> {
			synchronized (R1) {
				System.out.println("P1 locked R1");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					synchronized (R2) {
						System.out.println("P1 locked R2");
					}
				}
			}
		});
		Runnable P2 = new Thread(() -> {
			synchronized (R2) {
				System.out.println("P2  locked R2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					synchronized (R3) {
						System.out.println("P2 locked R3");
					}
				}
			}

		});
		Runnable P3 = new Thread(() -> {
			synchronized (R3) {
				System.out.println("P3 locked R3");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					synchronized (R1) {
						System.out.println("P3 locked R1");
					}
				}
			}
		});
		service.submit(P1);
		service.submit(P2);
		service.submit(P3);

		service.shutdown();
	}
}
