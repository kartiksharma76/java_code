package oops;

class Mobile {

	Mobile() {
		System.out.println("Default Constructor");
	}

	Mobile(String brand) {
		System.out.println("Brand: " + brand);
	}

	Mobile(String brand, int price) {
		System.out.println(brand + " " + price);
	}
}

public class ConstructorOverloadingExample {
	public static void main(String[] args) {
		new Mobile();
		new Mobile("Samsung");
		new Mobile("Apple", 90000);
	}
}
