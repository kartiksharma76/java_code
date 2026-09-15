package oopsrealproblem;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("ACC123", "Kartik", 5000);
		account.deposite(2000);
		account.withdraw(1500);
		System.out.println("Balance: " + account.getBalance());
		for (String transaction : account.getTransectionHistory()) {
			System.out.println(transaction);
		}

	}
}
