package Javaclasses;
public class Main {
	int modelYear;
	String modelName;

	// Constructor with one parameter
	public Main(String modelName) {
		// Call the two-parameter constructor to reuse code and set a default year
		this(2020, modelName);
	}

	// Constructor with two parameters
	public Main(int modelYear, String modelName) {
		// Use 'this' to assign values to the class variables
		this.modelYear = modelYear;
		this.modelName = modelName;
	}

	// Method to print car information
	public void printInfo() {
		System.out.println(modelYear + " " + modelName);
	}

	public static void main(String[] args) {
		// Create a car with only model name (uses default year)
		Main car1 = new Main("Corvette");

		// Create a car with both model year and name
		Main car2 = new Main(1969, "Mustang");

		Main car3 = new Main(2000, "Audi");
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
	}
}
