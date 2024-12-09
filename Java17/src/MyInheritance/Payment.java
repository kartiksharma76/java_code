package MyInheritance;

public abstract class  Payment{
  public void upiPayment() {
	  System.out.println("upiPayment");
  }
  public abstract void creditCardPayment();
}
abstract class Bank extends Payment{

//	@Override
//	public void creditCardPayment() {
//		
//	}
	
	
}
class SBI extends Bank{

	@Override
	public void creditCardPayment() {
		System.out.println("sbi credit card");
		
	}
	public static void main(String[] args) {
		SBI sbi= new SBI();
		sbi.upiPayment();
	}
	
}