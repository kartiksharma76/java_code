package oopsrealproblem;

public class UpiPayment implements PaymentMethod {
	private String upiId;

	public UpiPayment(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
		System.out.println("UPI ID: " + upiId);
		System.out.println("Payment Successful via UPI\n");
	}

}
