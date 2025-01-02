package Inheritance;

public  class BankAccount implements CheakingAccount, SavingAccount {
	private double checkingBalance;
	private double savingsBalance;
	private double interestRate;

	public BankAccount(double initialCheckingBalance, double initialSavingsBalance, double interestRate) {
		this.checkingBalance = initialCheckingBalance;
		this.savingsBalance = initialSavingsBalance;
		this.interestRate = interestRate;
	}

	public double InterestRate() {
		return interestRate;
	}

	@Override
	public void deposit(double amount) {
		checkingBalance += amount;

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= checkingBalance) {
			checkingBalance -= amount;
		} else {
			System.out.println("Insufficient balance in checking account.");
		}

	}

	@Override
	public double getBalance() {

		return checkingBalance;
	}

	@Override
	public double getInterestRate() {

		return interestRate;
	}

	public void transfer(double amount) {
		if (checkingBalance >= amount) {
			checkingBalance -= amount;
			savingsBalance += amount;
		} else {
			System.out.println("Insufficient funds for transfer.");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Checking Balance: " + checkingBalance);
		System.out.println("Savings Balance: " + savingsBalance);
		System.out.println("Interest Rate: " + interestRate + "%");
	}

}
