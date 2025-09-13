package oops;

public class Encaptulation {
	public static void main(String[] args) {
		BankAccount ac = new BankAccount();
		ac.deposit(1000);
		System.out.println("amount :" + ac.getBalance());
	}

}
