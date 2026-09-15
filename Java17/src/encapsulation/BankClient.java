package encapsulation;

public class BankClient {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.withdraw(5000));
	}
}
