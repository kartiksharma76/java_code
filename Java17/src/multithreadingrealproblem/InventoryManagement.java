package multithreadingrealproblem;

class Inventory {

	private int stock = 10;

	public synchronized void purchase(int quantity) {

		System.out.println("\n" + Thread.currentThread().getName() + " wants to buy " + quantity + " laptop(s)");

		if (stock >= quantity) {

			System.out.println("Order Placed Successfully");

			stock -= quantity;

			System.out.println("Remaining Stock : " + stock);

		} else {

			System.out.println("Order Failed");

			System.out.println("Only " + stock + " laptop(s) available.");
		}
	}
}

public class InventoryManagement {

	public static void main(String[] args) throws InterruptedException {

		Inventory inventory = new Inventory();

		Thread customer1 = new Thread(() -> inventory.purchase(4), "Customer-1");

		Thread customer2 = new Thread(() -> inventory.purchase(5), "Customer-2");

		Thread customer3 = new Thread(() -> inventory.purchase(3), "Customer-3");

		customer1.start();
		customer2.start();
		customer3.start();

		customer1.join();
		customer2.join();
		customer3.join();

		System.out.println("\nAll Orders Processed.");
	}
}