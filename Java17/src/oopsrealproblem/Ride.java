package oopsrealproblem;

abstract class Ride {
	protected String rideId;
	protected double distance; // in km
	protected double baseFare;

	public Ride(String rideId, double distance, double baseFare) {
		super();
		this.rideId = rideId;
		this.distance = distance;
		this.baseFare = baseFare;
	}

	public abstract double calculateFare();

	public void generateBill() {
		System.out.println("Ride ID: " + rideId);
		System.out.println("Distance: " + distance + " km");
		System.out.println("Total Fare: ₹" + calculateFare());
		System.out.println("---------------------------");
	}

}
