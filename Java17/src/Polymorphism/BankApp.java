package Polymorphism;

public class BankApp {
	public static void deposite(int amount, Bank bank) {
		if (bank instanceof SBI) {
			amount = amount + 10;
		} else if (bank instanceof PNB) {
			amount = amount + 5;
		} else if (bank instanceof Bank) {
			System.out.println("bank not mention");
		}
		bank.deposite(amount);
	}

}
