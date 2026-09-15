package encapsulation;

public class BankAccount1 {
	private int accountNumber;
	private double balance;

	public BankAccount1(int accountNumber, double initialbalance) {
		this.accountNumber = accountNumber;
		this.balance = initialbalance;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("deposite" + amount);
		} else {
			System.out.println("initial deposite amount");
		}

	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw amount");
		} else {
			System.out.println("inuffisient balance");
		}
	}
}