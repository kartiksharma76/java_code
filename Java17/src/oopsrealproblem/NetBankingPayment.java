package oopsrealproblem;

public class NetBankingPayment implements PaymentMethod {
	 private String bankName;
	 public NetBankingPayment(String bankName) {
		 this.bankName = bankName;
	 }
	@Override
	public void pay(double amount) {
		System.out.println("Processing Net Banking payment of ₹" + amount);
        System.out.println("Bank: " + bankName);
        System.out.println("Payment Successful via Net Banking\n");
		
	}

}
