package oopsrealproblem;

public class PaymentProcessor {
	public static void main(String[] args) {
		PaymentMethod payment1 = new CreditCardPayment("1234567812345678");
		PaymentMethod payment2 = new UpiPayment("kartik@upi");
		PaymentMethod payment3 = new NetBankingPayment("HDFC Bank");

		payment1.pay(5000);
		payment2.pay(1500);
		payment3.pay(10000);
	}
}
