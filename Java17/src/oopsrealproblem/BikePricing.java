package oopsrealproblem;

public class BikePricing implements PricingStrategy {

	@Override
	public double calculate(long hours) {
		return hours * 20;
	}

}
