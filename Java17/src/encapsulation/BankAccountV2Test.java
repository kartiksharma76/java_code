package encapsulation;

public class BankAccountV2Test {
	public static void main(String[] args) {
		BankAccountV2 ba1 = new BankAccountV2(100.00);

		System.out.print("Before transaction, ");
		ba1.display();

		ba1.deposite(74.35);
		ba1.withdraw(20.00);

		System.out.print("After transections, ");
		ba1.display();
	}
}
