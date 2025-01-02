package Inheritance;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.00, 5000.00, 0.02);

		account.deposit(500.00); // Deposit to checking
		account.withdraw(200.00); // Withdraw from checking
		account.transfer(1000.00); // Transfer from checking to savings

		account.displayAccountInfo();
	}
}
