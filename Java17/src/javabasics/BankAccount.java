package javabasics;

public class BankAccount {
	public String accountHolderName;
	protected double balance;
	int transactionCount;
	private String pin;

	public BankAccount(String holder, double initialBalance, String pin) {
		this.accountHolderName = holder;
		this.balance = initialBalance;
		this.transactionCount = 0;
		this.pin = pin; 
	}

	public boolean validatePin(String inputPin) {
		return this.pin.equals(inputPin);
	}

	protected void displayInfo() {
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: $" + balance);
		System.out.println("Transactions: " + transactionCount);
	}

	void incrementTransactionCount() {
		this.transactionCount++;
	}

	private void logTransaction(String details) {
		System.out.println("[LOG] " + details);
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			incrementTransactionCount();
			logTransaction("Withdrawal of $" + amount);
		} else {
			System.out.println("Insufficient funds or invalid amount.");
		}
	}
}