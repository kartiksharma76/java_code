package oopsrealproblem;

public class Bike extends Vehicle {

	public Bike(String licenceNumber) {
		super(licenceNumber);
	}

	@Override
	public String getType() {
		return "Bike";
	}

}
class Car extends Vehicle{
	public Car(String licenceNumber) {
		super(licenceNumber);
	}
	@Override
	public String getType() {
		return "Car";
	}
}

class Truck extends Vehicle{

	public Truck(String licenceNumber) {
		super(licenceNumber);
	}

	@Override
	public String getType() {
		return "Truck";
	}
	
}
