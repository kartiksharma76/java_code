package Polymorphism;

public class SBI implements Bank {

	@Override
	public void deposite(int amount) {
		System.out.println(amount + " deposited in SBI");

	}

}
