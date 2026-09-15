package encapsulation;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(12345, 1000.0);
		System.out.println("AccountNumber:" + account.getAccountNumber());
		System.out.println("initialBalance:" + account.getBalance());

		account.deposite(500);
		account.withdraw(200);

		System.out.println("final Balance:" + account.getBalance());

	}
}
