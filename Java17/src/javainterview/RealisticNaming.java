package javainterview;

class Car {
	String model;
	int wheels;

	// defaultconstructor
	Car() {
		this("Sedan", 4);
		System.out.println("Default constructor called");
	}

	// Single Parameter Constructor
	Car(String model) {
		this(model, 4);
		System.out.println("Single parameter constructor called");
	}

	// Two Parameter Constructor
	public Car(String model, int wheels) {
		this.model = model;
		this.wheels = wheels;

		System.out.println("Two parameter constructor called");
	}
}

public class RealisticNaming {
	public static void main(String[] args) {
		Car c = new Car();
	}
}
