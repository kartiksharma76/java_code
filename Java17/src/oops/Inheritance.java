package oops;

class Vehicle {
	String brand = "ford";

	void m1() {
		System.out.println("Tuut tuut !");
	}
}

class Car extends Vehicle {
	String model = "Mustang";
}

public class Inheritance {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.brand);
		System.out.println(car.model);
		car.m1();
	}
}
