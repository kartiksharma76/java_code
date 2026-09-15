package javainterview;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 120;
		double bill;
		if (units <= 100)
			bill = units * 1.5;
		else if (units <= 200)
			bill = units * 2;
		else
			bill = units * 3;
		System.out.println("Bill = " + bill);
	}
}
