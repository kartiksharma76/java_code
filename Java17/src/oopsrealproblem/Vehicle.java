package oopsrealproblem;

abstract class Vehicle {
protected String licenceNumber;
public Vehicle(String licenceNString) {
	this.licenceNumber =licenceNumber;
}
public abstract String getType();
}
