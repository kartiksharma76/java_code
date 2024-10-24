package javabasics;

public class AccesModiefier {
	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.showbalance();
	}
}

class Bank {
	private int balance = 4000;

	public void showbalance() {
		System.out.println(balance);
	}
}