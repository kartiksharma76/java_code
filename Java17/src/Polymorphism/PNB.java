package Polymorphism;

public class PNB implements Bank {

	@Override
	public void deposite(int amount) {
		System.out.println(amount + " deposited in PNB");

	}

}
