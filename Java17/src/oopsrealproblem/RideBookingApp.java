package oopsrealproblem;

public class RideBookingApp {
	public static void main(String[] args) {
		Ride ride1 = new BikeRide("R101", 5);
		Ride ride2 = new AutoRide("R102", 5);
		Ride ride3 = new CabRide("R103", 5, 1.5);

		ride1.generateBill();
		ride2.generateBill();
		ride3.generateBill();
	}
}
