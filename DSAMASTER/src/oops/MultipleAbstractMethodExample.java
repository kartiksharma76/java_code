package oops;

abstract class VehicleService {

    abstract void start();

    abstract void stop();

    void fuel() {
        System.out.println("Fuel Filled");
    }
}

class BikeService extends VehicleService {

    @Override
    void start() {
        System.out.println("Bike Started");
    }

    @Override
    void stop() {
        System.out.println("Bike Stopped");
    }
}

public class MultipleAbstractMethodExample {

    public static void main(String[] args) {

        BikeService bike = new BikeService();

        bike.start();
        bike.stop();
        bike.fuel();
    }
}