package multithreadingrealproblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

class BarberShop {

	private final Semaphore chairs = new Semaphore(3);
	private final Queue<String> waitingQueue = new LinkedList<>();

	public synchronized void customerArrives(String customer) {

		System.out.println(customer + " entered the shop.");

		if (chairs.tryAcquire()) {

			waitingQueue.offer(customer);

			System.out.println(customer + " is waiting.");

			notifyAll();

		} else {

			System.out.println(customer + " left because no chair is available.");
		}
	}

	public synchronized void barberWorks() {

		while (true) {

			while (waitingQueue.isEmpty()) {

				System.out.println("\nBarber is sleeping...");

				try {

					wait();

				} catch (InterruptedException e) {

					Thread.currentThread().interrupt();
					return;
				}
			}

			String customer = waitingQueue.poll();

			chairs.release();

			System.out.println("\nBarber is cutting hair of " + customer);

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {

				Thread.currentThread().interrupt();
				return;
			}

			System.out.println("Barber finished " + customer);
		}
	}
}

public class SleepingBarberDemo {

	public static void main(String[] args) throws InterruptedException {

		BarberShop shop = new BarberShop();

		Thread barber = new Thread(shop::barberWorks);

		barber.start();

		for (int i = 1; i <= 10; i++) {

			final int id = i;

			new Thread(() -> shop.customerArrives("Customer-" + id)).start();

			Thread.sleep(500);
		}

		Thread.sleep(15000);

		barber.interrupt();

		System.out.println("\nShop Closed.");
	}
}
