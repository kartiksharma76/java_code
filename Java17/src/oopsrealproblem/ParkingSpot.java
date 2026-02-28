package oopsrealproblem;

class ParkingSpot {

    private String spotId;
    private String allowedVehicleType;
    private boolean isOccupied;

    public ParkingSpot(String spotId, String allowedVehicleType) {
        this.spotId = spotId;
        this.allowedVehicleType = allowedVehicleType;
        this.isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return !isOccupied && vehicle.getType().equals(allowedVehicleType);
    }

    public void parkVehicle() {
        isOccupied = true;
    }

    public void removeVehicle() {
        isOccupied = false;
    }

    public String getSpotId() {
        return spotId;
    }
}