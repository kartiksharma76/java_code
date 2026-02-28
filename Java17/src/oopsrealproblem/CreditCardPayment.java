package oopsrealproblem;

public class CreditCardPayment implements PaymentMethod {
	private String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Processing Credit Card payment of ₹" + amount);
		System.out.println("Card Used: ****" + cardNumber.substring(cardNumber.length() - 4));
		System.out.println("Payment Successful via Credit Card\n");

	}

}
