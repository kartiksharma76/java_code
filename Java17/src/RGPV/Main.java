package RGPV;

public class Main {
	public static void main(String[] args) {
		Car myCar = createCar1("Red", 2023);
		myCar.printdetail(); // Output: Color: Red, Year: 2023
	}

	public static Car createCar1(String color, int year) {
		Car car = new Car(color, year);
		return car;
	}
}