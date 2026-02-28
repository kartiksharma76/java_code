package oopsrealproblem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
private List<ParkingSpot> spots = new ArrayList<>();
public void addSpot(ParkingSpot spot) {
	spots.add(spot);
}
public Ticket parkVehicle(Vehicle vehicle) throws IllegalAccessException {
	
	for (ParkingSpot spot : spots) {
        if (spot.canFitVehicle(vehicle)) {
            spot.parkVehicle();
            System.out.println("Vehicle parked at spot: " + spot.getSpotId());
            return new Ticket(vehicle, spot);
        }
    }
throw new IllegalAccessException("No available spot for vehicle type");
}
}
