package multithreadingrealproblem;

import java.util.concurrent.Semaphore;

class Bridge {

	private final Semaphore semaphore = new Semaphore(2);

	public void crossBridge() {

		try {

			System.out.println(Thread.currentThread().getName() + " is waiting to cross...");

			semaphore.acquire();

			System.out.println(Thread.currentThread().getName() + " entered the bridge.");

			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName() + " crossed the bridge.");

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		} finally {

			semaphore.release();
		}
	}
}

public class TrafficSignalDemo {

	public static void main(String[] args) throws InterruptedException {

		Bridge bridge = new Bridge();

		for (int i = 1; i <= 5; i++) {

			Thread car = new Thread(bridge::crossBridge, "Car-" + i);

			car.start();
		}
	}
}