package multithreadingrealproblem;

class BankAccount {
	private int balance = 500;

	public synchronized void deposite(int amount) {
		System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount);

		balance += amount;
		System.out.println("Current Balance : ₹" + balance);
		notifyAll();

	}

	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " wants to withdraw ₹" + amount);

		while (balance < amount) {

			System.out.println("Insufficient Balance... Waiting");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
		balance -= amount;

		System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount);

		System.out.println("Remaining Balance : ₹" + balance);
	}
}

public class BankDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread withdrawThread = new Thread(() -> {
			account.withdraw(1000);
		}, "Withdraw Thread");

		Thread depositeThread = new Thread(() -> {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			account.deposite(2000);

		}, "Deposit Thread");

		withdrawThread.start();
		depositeThread.start();

		try {
			depositeThread.join();
			withdrawThread.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("\nTransaction Completed.");
	}
}
