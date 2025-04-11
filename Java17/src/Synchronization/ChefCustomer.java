package Synchronization;

import java.util.ArrayList;
import java.util.List;

public class ChefCustomer {
	private static int capacity = 10;
	private List<String> dishes = new ArrayList<>();

	Runnable chef = () -> {
		while (true) {
			synchronized (dishes) {
				while (dishes.size() == capacity) {
					try {
						dishes.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				String dish = "pasta";
				dishes.add(dish);
				System.out.println("Prepared by Chef: Dish " + dish);
				dishes.notify();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	Runnable customer = () -> {
		while (true) {
			synchronized (dishes) {
				while (dishes.isEmpty()) {
					try {
						dishes.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				String dish = dishes.remove(0);
				System.out.println("Eaten by Customer: Dish " + dish);
				dishes.notify();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {
		ChefCustomer restaurant = new ChefCustomer();
		Runnable chef1 = restaurant.chef;
		Runnable customer1 = restaurant.customer;
		Thread t1 = new Thread(chef1);
		Thread t2 = new Thread(customer1);
		t1.start();
		t2.start();
	}
}
