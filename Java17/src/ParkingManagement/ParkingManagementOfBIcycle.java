package ParkingManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParkingManagementOfBIcycle {
	public static int capacity = 20;
	List<String> parkingOfBicycle = new ArrayList<>();

	Runnable entry = () -> {
		while (true) {
			synchronized (parkingOfBicycle) {
				while (parkingOfBicycle.size() == capacity) {
					System.out.println("Entry blocked: Parking is full.");
					try {
						parkingOfBicycle.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				String bicycle = "motorcycle-" + Thread.currentThread().getId();
				parkingOfBicycle.add(bicycle);
				System.out.println("Motorcycle entered: " + bicycle + " | Total parked: " + parkingOfBicycle.size());
				parkingOfBicycle.notifyAll();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	Runnable exit = () -> {
		while (true) {
			synchronized (parkingOfBicycle) {
				while (parkingOfBicycle.isEmpty()) {
					System.out.println("Exit waiting: No motercycle to exit");
					try {
						parkingOfBicycle.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String vehicle = parkingOfBicycle.remove(0);
				System.out.println("Vehicle Exit: " + vehicle + " | Remaining Vehicles: " + parkingOfBicycle.size());
				parkingOfBicycle.notify();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingManagementOfBIcycle pmb = new ParkingManagementOfBIcycle();
		service.submit(pmb.entry);
		service.submit(pmb.exit);
	}

}
