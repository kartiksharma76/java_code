package Inheritance;

public class Bank {
	protected String accountHolder;
	protected String accountNumber;
	protected double balance;

	public Bank(String accountHolder, String accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw: $" + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void displayBalance() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: $" + balance);
	}
}

class SavingAccount1 extends Bank {
	private double interestRate;

	public SavingAccount1(String accountHolder, String accountNumber, double balance, double interestRate) {
		super(accountHolder, accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest of $" + interest + " applied");
	}
}

class CurrentAccount extends Bank {
	private double overdraftLimit;

	public CurrentAccount(String accountHolder, String accountNumber, double balance, double overdraftLimit) {
		super(accountHolder, accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Overdraft limit exceeded!");
		}
	}
}
