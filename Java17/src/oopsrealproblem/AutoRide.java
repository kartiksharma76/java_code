package oopsrealproblem;

public class AutoRide extends Ride {
	private static final double RATE_PER_KM = 15;

	public AutoRide(String rideId, double distance) {
		super(rideId, distance, 30);
	}

	@Override
	public double calculateFare() {
		return baseFare + (distance * RATE_PER_KM);
	}

}
