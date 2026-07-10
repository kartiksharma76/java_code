//package oops;
//
//interface Vehicle {
//
//	void drive();
//}
//
//class CarVehicle implements Vehicle {
//
//	@Override
//	public void drive() {
//		System.out.println("Driving Car");
//	}
//}
//
//class BikeVehicle implements Vehicle {
//
//	@Override
//	public void drive() {
//		System.out.println("Riding Bike");
//	}
//}
//
//class VehicleFactory {
//
//	public static Vehicle getVehicle(String type) {
//
//		if (type.equalsIgnoreCase("Car")) {
//			return new CarVehicle();
//		}
//
//		if (type.equalsIgnoreCase("Bike")) {
//			return new BikeVehicle();
//		}
//
//		return null;
//	}
//}
//
//public class VehicleFactoryExample {
//
//	public static void main(String[] args) {
//
//		Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
//		vehicle1.drive();
//
//		Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
//		vehicle2.drive();
//	}
//}