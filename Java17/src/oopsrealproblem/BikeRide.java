package oopsrealproblem;

public class BikeRide extends Ride{
	private static final double RATE_PER_KM = 10;
	
	public BikeRide(String rideId, double distance) {
		super(rideId, distance, 20);
	}

	@Override
	public double calculateFare() {
		return baseFare + (distance * RATE_PER_KM);
	}

}
