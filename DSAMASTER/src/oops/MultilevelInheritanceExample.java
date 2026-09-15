package oops;

class Vehicle {

	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car1 extends Vehicle {

	void drive() {
		System.out.println("Car is Driving");
	}
}

class SportsCar extends Car1 {

	void speed() {
		System.out.println("Sports Car Speed is 250 km/h");
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {

		SportsCar sc = new SportsCar();

		sc.start();
		sc.drive();
		sc.speed();
	}
}