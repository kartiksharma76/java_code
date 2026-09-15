package ParkingManagement;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagement1 {
	public static int capacity = 10;
	List<String> parking = new ArrayList<>();
	Runnable entry = () -> {
		while (true) {
			synchronized (parking) {
				while (parking.size() == capacity) {
					System.out.println("Entry blocked: Parking full");
					try {
						parking.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String vehicle = "car-" ;
				parking.add(vehicle);
				System.out.println("Vehicle Entered: " + vehicle + " | Vehicles: " + parking.size());
				parking.notify();
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
			synchronized (parking) {
				while (parking.isEmpty()) {
					System.out.println("Exit waiting: No vehicles to exit");
					try {
						parking.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String vehicle = parking.remove(0);
				System.out.println("Vehicle Exit: " + vehicle + " | Vehicles: " + parking.size());
				parking.notify();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public static void main(String[] args) {
		ParkingManagement1 pm = new ParkingManagement1();
		Thread t1 = new Thread(pm.entry);
		Thread t2 = new Thread(pm.entry);
		Thread t3 = new Thread(pm.exit);
		Thread t4 = new Thread(pm.exit);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
