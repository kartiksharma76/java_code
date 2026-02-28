package oopsrealproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * How is encaptulation achived ?
 * Answer:
 * Data member are private
 * controlled modification via public methods
 * Inveriants are protected(balance never negative
 * Immutable critical field(accountNumber)
 * 
 */
public class BankAccount {
	private final String accountNumber;
	private String accountHolderName;
	private double balance;
	private final List<String> transectionHistory;

	public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
		if (accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Account number cannot be null or empty");
		}

		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative");

		}

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		this.transectionHistory = new ArrayList<>();
		transectionHistory.add("Account created with balance: " + initialBalance);

	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.accountHolderName = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		balance += amount;
		transectionHistory.add("Deposited:" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive");

		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");

		}
		balance -= amount;
		transectionHistory.add("withdrawn:" + amount);
	}

	public List<String> getTransectionHistory() {
		return Collections.unmodifiableList(transectionHistory);
	}

}
