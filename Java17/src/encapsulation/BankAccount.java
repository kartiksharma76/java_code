package encapsulation;

public class BankAccount {
	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double initilialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initilialBalance;

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

			System.out.println("deposited:" + amount);

		} else {
			System.out.println("invailed deposite amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw:" + amount);

		} else {
			System.out.println("insuffisient balance or invailed withdraw amount.");
		}
	}
}
