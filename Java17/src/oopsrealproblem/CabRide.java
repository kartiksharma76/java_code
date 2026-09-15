package oopsrealproblem;

public class CabRide extends Ride {
	private static final double RATE_PER_KM = 25;
	private double surgeMultiplier;

	public CabRide(String rideId, double distance, double surgeMultiplier) {
		super(rideId, distance, 50);
		this.surgeMultiplier = surgeMultiplier;
	}

	@Override
	public double calculateFare() {
		return (baseFare + (distance * RATE_PER_KM)) * surgeMultiplier;
	}

}
