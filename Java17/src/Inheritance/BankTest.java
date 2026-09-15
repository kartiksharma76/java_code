package Inheritance;

public class BankTest {
	public static void main(String[] args) {
		SavingAccount1 sa = new SavingAccount1("Kartikeysharma", "saving1234", 100000, 4.5);
		sa.deposit(1000);
		sa.applyInterest();
		sa.displayBalance();

		System.out.println();

		CurrentAccount ca = new CurrentAccount("Kirtan", "CUR456", 50000, 5000);
		ca.withdraw(6000);
		ca.displayBalance();

	}
}
