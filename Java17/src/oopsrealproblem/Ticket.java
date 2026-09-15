package oopsrealproblem;

import java.time.LocalDateTime;

class Ticket {

    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public void closeTicket() {
        this.exitTime = LocalDateTime.now();
        spot.removeVehicle();
    }

    public long getParkingDurationInHours() {
        return java.time.Duration.between(entryTime, exitTime).toHours();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}