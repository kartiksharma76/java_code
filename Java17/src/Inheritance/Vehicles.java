package Inheritance;

public class Vehicles {
	void vehicleInfo() {
		System.out.println("This is a vehicle.");
	}
}

class Car extends Vehicles {
	void carInfo() {
		System.out.println("This is a car.");
	}
}

class Truck extends Vehicles {
	void truckInfo() {
		System.out.println("This is a truck.");
	}
}

class SportsCar extends Car {
	void sportsCarInfo() {
		System.out.println("This is a sports car.");
	}
}
