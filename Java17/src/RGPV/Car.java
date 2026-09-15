package RGPV;

public class Car {
	String colour;
	int year;

	public Car(String name, int year) {
		this.colour = colour;
		this.year = year;

	}

	public void printdetail() {
		System.out.println("colour" + colour + "year" + year);

	}

	public static void main(String[] args) {
		Car mycar = new Car("red", 2024);
		modifyCar(mycar);
		mycar.printdetail();
	}

	public static void modifyCar(Car mycar) {
		mycar.colour = "blue";

	}
}
