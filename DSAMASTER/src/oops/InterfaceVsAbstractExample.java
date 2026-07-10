package oops;

interface VehicleInterface {

	void start();
}

abstract class MachineBase {

	abstract void stop();

	void fuel() {
		System.out.println("Fuel Filled");
	}
}

class ElectricCar extends MachineBase implements VehicleInterface {

	@Override
	public void start() {
		System.out.println("Electric Car Started");
	}

	@Override
	void stop() {
		System.out.println("Electric Car Stopped");
	}
}

public class InterfaceVsAbstractExample {

	public static void main(String[] args) {

		ElectricCar car = new ElectricCar();

		car.start();
		car.stop();
		car.fuel();
	}
}