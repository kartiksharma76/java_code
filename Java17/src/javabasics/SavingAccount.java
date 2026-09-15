package javabasics;

import java.util.Scanner;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(String holder, double initialBalance, String pin, double rate) {
		super(holder, initialBalance, pin);
		this.interestRate = rate;
	}

	public void addInterest() {
		balance += balance * interestRate;
		incrementTransactionCount();
	}

	@Override
	protected void displayInfo() {
		super.displayInfo();
		System.out.println("Interest Rate: " + (interestRate * 100) + "%");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account holder name: ");
		String name = scanner.nextLine();

		System.out.print("Enter initial balance: ");
		double balance = scanner.nextDouble();

		System.out.print("Enter PIN: ");
		String pin = scanner.next();

		System.out.print("Enter annual interest rate (e.g., 0.05 for 5%): ");
		double rate = scanner.nextDouble();

		SavingAccount sa = new SavingAccount(name, balance, pin, rate);

		System.out.print("\nUpdate account holder name? (current: " + sa.accountHolderName + ") - Press Enter to skip or type new name: ");
		scanner.nextLine();
		String newName = scanner.nextLine();
		if (!newName.trim().isEmpty()) {
			sa.accountHolderName = newName;
		}

		System.out.println("\n--- Initial Account Info ---");
		sa.displayInfo();

		System.out.print("\nEnter amount to withdraw: ");
		double withdrawAmount = scanner.nextDouble();
		sa.withdraw(withdrawAmount);

		System.out.println("\nAdding interest...");
		sa.addInterest();

		System.out.println("\n--- Final Account Info ---");
		sa.displayInfo();

		System.out.print("\nEnter PIN to validate: ");
		String inputPin = scanner.next();
		System.out.println("PIN valid? " + sa.validatePin(inputPin));

		scanner.close();
	}
}