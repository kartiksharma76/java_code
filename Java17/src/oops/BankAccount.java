package oops;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}


	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid amount!");
		}
	}
}