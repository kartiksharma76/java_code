package Java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Constructor for easy initialization 1. Create and populate bank accounts 2.
 * Define predicates 3. Filter premium accounts 4. Output results
 */
class BankAccount {
	String customerId;
	double balance;
	boolean isActive;

	// Constructor for easy initialization
	public BankAccount(String customerId, double balance, boolean isActive) {
		this.customerId = customerId;
		this.balance = balance;
		this.isActive = isActive;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}

public class PredicateExample {

	public static void main(String[] args) {

		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount("C001", 1500.0, true));
		accounts.add(new BankAccount("C002", 800.0, true));
		accounts.add(new BankAccount("C003", 2000.0, false));
		accounts.add(new BankAccount("C004", 1200.0, true));

		// 2. Define predicates
		Predicate<BankAccount> hasBalance = acc -> acc.getBalance() > 1000;
		Predicate<BankAccount> isActiveAccount = acc -> acc.isActive();

		// 3. Filter premium accounts
		List<BankAccount> premiumAccounts = accounts.stream().filter(isActiveAccount.and(hasBalance)).toList();

		// 4. Output results
		System.out.println("Premium Accounts (Active + Balance > $1000):");
		premiumAccounts
				.forEach(acc -> System.out.println("ID: " + acc.getCustomerId() + ", Balance: $" + acc.getBalance()));
	}
}
