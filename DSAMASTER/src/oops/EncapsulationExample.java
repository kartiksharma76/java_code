package oops;

class BankAccount {

	private String accountHolder;
	private double balance;

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		account.setAccountHolder("Kartik");
		account.setBalance(5000);

		System.out.println(account.getAccountHolder());
		System.out.println(account.getBalance());
	}
}