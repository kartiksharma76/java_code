package InfosysSpringboard;

class Bill {

	// Static variable
	private static int counter = 9000;

	// Instance variables
	private String billId;
	private String paymentMode;

	// Constructor
	public Bill(String paymentMode) {
		this.paymentMode = paymentMode; 	 
		counter++;
		this.billId = "B" + counter;
	}

	// Getter methods
	public String getBillId() {
		return billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	// Setter methods
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}

class CheckBill {

	public static void main(String[] args) {

		Bill bill1 = new Bill("DebitCard");
		Bill bill2 = new Bill("PayPal");

		Bill bills[] = { bill1, bill2 };

		for (Bill bill : bills) {

			System.out.println("Bill Details");
			System.out.println("Bill Id: " + bill.getBillId());
			System.out.println("Payment method: " + bill.getPaymentMode());
			System.out.println();
		}
	}
}