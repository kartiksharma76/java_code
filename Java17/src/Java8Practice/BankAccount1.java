package Java8Practice;

public class BankAccount1 {
	private int accountNumber;
	private int customerId;
	private double balance;
	private String branch;

	public BankAccount1(int accountNumber, int customerId, double balance, String branch) {
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.balance = balance;
		this.branch = branch;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public double getBalance() {
		return balance;
	}

	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "AccNo=" + accountNumber + ", CustID=" + customerId + ", Balance=" + balance + ", Branch='" + branch
				+ '\'';
	}
}
