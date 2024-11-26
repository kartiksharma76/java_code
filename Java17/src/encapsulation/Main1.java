package encapsulation;

public class Main1 {
	public static void main(String[] args) {
		BankAccount b = new BankAccount(375181001, 100000);
		System.out.println("AccountNumber:" + b.getAccountNumber());
		System.out.println("InitialBalance:" + b.getBalance());

		b.deposite(1000000);
		b.withdraw(100000);
		System.out.println("final balance" + b.getBalance());
	}

}
