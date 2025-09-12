package javabasics;

public class AccounterTester {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Kartik", 1000.0, "1234");
		account.accountHolderName = "kartik sharma";
		
		account.balance = 1500.0;
		
		account.transactionCount = 5;
		
		System.out.println("PIN valid ? " + account.validatePin("1234"));
		
		account.displayInfo();
		account.incrementTransactionCount();
		
		account.withdraw(200);
		System.out.println("Final Balance :" + account.balance);
	}
}