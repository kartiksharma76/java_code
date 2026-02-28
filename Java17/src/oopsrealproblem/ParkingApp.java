package oopsrealproblem;

public class ParkingApp {

    public static void main(String[] args) throws IllegalAccessException {

        ParkingLot lot = new ParkingLot();

        lot.addSpot(new ParkingSpot("S1", "Car"));
        lot.addSpot(new ParkingSpot("S2", "Bike"));

        Vehicle car = new Car("MP04AB1234");

        Ticket ticket = lot.parkVehicle(car);

        // simulate exit
        try { Thread.sleep(3000); } catch (Exception e) {}

        ticket.closeTicket();

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(ticket, new CarPricing());
    }
}