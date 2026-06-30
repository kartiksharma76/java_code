package multithreadingrealproblem;

class ATM {
	private int balance = 10000;

	public synchronized void withdraw(int amount) {
		System.out.println("\n" + Thread.currentThread().getName() + " wants ₹" + amount);

		if (balance >= amount) {
			System.out.println("Transaction Successful");

			balance -= amount;

			System.out.println("Remaining Balance : ₹" + balance);
		} else {
			System.out.println("Insufficient Balance");

			System.out.println("Available Balance : ₹" + balance);
		}
	}
}

public class ATMDemo {
	public static void main(String[] args) throws InterruptedException {
		ATM atm = new ATM();

		Thread customer1 = new Thread(() -> atm.withdraw(4000), "Customer-1");

		Thread customer2 = new Thread(() -> atm.withdraw(5000), "Customer-2");

		Thread customer3 = new Thread(() -> atm.withdraw(3000), "Customer-3");

		customer1.start();
		customer2.start();
		customer3.start();

		customer1.join();
		customer2.join();
		customer3.join();

		System.out.println("\nAll ATM Transactions Completed.");
	}
}
