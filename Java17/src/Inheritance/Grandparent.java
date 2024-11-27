package Inheritance;

public class Grandparent {
	String name;

	public Grandparent(String name) {
		this.name = name;
	}
}

class Son extends Grandparent {
	String carName;
	String bikeName;
	int bankBalance;

	public Son(String name, String carName, String bikeName, int bankBalance) {
		super(name);
		this.carName = carName;
		this.bikeName = bikeName;
		this.bankBalance = bankBalance;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Car Name: " + carName);
		System.out.println("Bike Name: " + bikeName);
		System.out.println("Bank Balance: " + bankBalance);
		System.out.println();
	}
}
