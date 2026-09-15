package encapsulation;

public class BankAccountV2 {
	private double balance;

	public BankAccountV2(double openingBalance) {
		balance = openingBalance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void display() {
		System.out.println("balance=" + balance);
	}
}
