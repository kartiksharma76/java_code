package Practicesheet;

class Vehicle {
	// protected - acceble in child classes
	protected String brand;
	private int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;

		System.out.println("vehicele Constructor:" + brand);
	}

	public void start() {
		System.out.println("Vehicle starting....");
	}

	public void stop() {
		System.out.println("Vehicle stopping...");
	}

	// Getter for private field
	public int getYear() {
		return year;
	}

	// can be overridden
	public void displayInfo() {
		System.out.println("Brand:" + brand + ",year:" + year);

	}

	// Final method - cannot be overridden
	public final void chassisNumber() {
		System.out.println("CH-12345");
	}

	// Static method - not inherited but can be accessed
	public static void vehicleType() {
		System.out.println("Generic Vehicle");
	}

}

//Derived class (Child/Sub class)
class Car extends Vehicle {
	private int doors;

	// Constructor must call parent constructor
	public Car(String brand, int year, int doors) {
		super(brand, year);
		this.doors = doors;
		System.out.println("Car constructor:" + brand);
	}

	// method overriding
	@Override
	public void start() {
		// Can call parent method using super
		super.start();
		System.out.println("Car engine starting...Vroom!");
	}

	// Additional method specific to Car
	public void openDoors() {
		System.out.println("Opening " + doors + " doors");
	}

	// Override displayInfo
	@Override
	public void displayInfo() {
		// Call parent's method
		super.displayInfo();
		System.out.println("Doors: " + doors);
	}
	// Cannot override final method
	// public void chassisNumber() { } // ERROR

	// Hide static method (not override)
	public static void vehicleType() {
		System.out.println("Car Vehicle");
	}

}

//Multi-level inheritance
class SportsCar extends Car {
	private boolean turbo;

	public SportsCar(String brand, int year, int doors, boolean turbo) {
		super(brand, year, doors);
		this.turbo = turbo;
	}

	@Override
	public void start() {
		super.start();
		if (turbo) {
			System.out.println("Turbo activated!");
		}
	}

	public void activateTurbo() {
		if (turbo) {
			System.out.println("Turbo boost!");
		}
	}
}

//Hierarchical inheritance
class Bike extends Vehicle {
	private boolean hasCarrier;

	public Bike(String brand, int year, boolean hasCarrier) {
		super(brand, year);
		this.hasCarrier = hasCarrier;
	}

	@Override
	public void start() {
		System.out.println("Kick starting bike...");
	}

	public void ringBell() {
		System.out.println("Ring ring!");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("=== Basic Inheritance ===");
		Car myCar = new Car("Toyota", 2023, 4);
		myCar.start();
		myCar.openDoors();
		myCar.displayInfo();
		myCar.chassisNumber();// Inherited final method

		System.out.println("\n=== Polymorphism ===");
		Vehicle vehicle = new Car("Honda", 2022, 2);
		vehicle.start(); // Calls Car's start()
		vehicle.displayInfo(); // Calls Car's displayInfo()
		// vehicle.openDoors(); // ERROR - Vehicle type doesn't have this

		System.out.println("\n=== Multi-level Inheritance ===");
		SportsCar sportsCar = new SportsCar("Ferrari", 2024, 2, true);
		sportsCar.start();
		sportsCar.activateTurbo();

		System.out.println("\n=== Hierarchical Inheritance ===");
		Bike bike = new Bike("Yamaha", 2023, true);
		bike.start();
		bike.ringBell();

		System.out.println("\n=== Type Casting ===");
		// Upcasting (implicit)
		Vehicle v1 = myCar;

		// Downcasting (explicit)
		if (v1 instanceof Car) {
			Car c1 = (Car) v1;
			c1.openDoors();

		}

		System.out.println("\n=== Static Methods ===");
		Vehicle.vehicleType(); // Generic Vehicle
		Car.vehicleType(); // Car Vehicle (hiding, not overriding)

	}
}
