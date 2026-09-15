package multithreadingrealproblem;

import java.util.LinkedList;
import java.util.Queue;

class Restaurant {

	private final Queue<String> orders = new LinkedList<>();
	private final int CAPACITY = 5;
	private int orderNumber = 1;

	public synchronized void placeOrder() {

		while (orders.size() == CAPACITY) {

			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}

		String order = "Order-" + orderNumber++;

		orders.add(order);

		System.out.println(Thread.currentThread().getName() + " placed " + order);

		notifyAll();
	}

	public synchronized void prepareOrder() {

		while (orders.isEmpty()) {

			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}

		String order = orders.poll();

		System.out.println(Thread.currentThread().getName() + " prepared " + order);

		notifyAll();
	}
}

public class RestaurantDemo {

	public static void main(String[] args) throws InterruptedException {

		Restaurant restaurant = new Restaurant();

		Thread waiter1 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {

				restaurant.placeOrder();

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}

		}, "Waiter-1");

		Thread waiter2 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {

				restaurant.placeOrder();

				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}

		}, "Waiter-2");

		Thread chef = new Thread(() -> {

			for (int i = 1; i <= 10; i++) {

				restaurant.prepareOrder();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}

		}, "Chef");

		waiter1.start();
		waiter2.start();
		chef.start();

		waiter1.join();
		waiter2.join();
		chef.join();

		System.out.println("\nRestaurant Closed.");
	}
}
