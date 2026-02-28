package oopsrealproblem;

public class PaymentService {
public double processPayment(Ticket ticket, PricingStrategy strategy) {
	long hours = ticket.getParkingDurationInHours();
	double amount = strategy.calculate(hours);
	System.out.println("Parking Hours: " + hours);
    System.out.println("Total Amount: ₹" + amount);	
	return amount;
	
}
}
