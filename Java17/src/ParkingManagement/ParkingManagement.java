package ParkingManagement;

/**
 * 1.capacity flexible but initial capacity=10
 * 2.vehicle types(only 4 wheeler)
 * 3.parking free
 * 4.Entry and exit (are two gate)
 * 5.Exit no Restriction
 * 6.entry restriction one by one
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParkingManagement {
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
				String vehicle = "car-" + Thread.currentThread().getId();
				parking.add(vehicle);
				System.out.println("Vehicle Entered: " + vehicle + " | Total Vehicles: " + parking.size());
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
				System.out.println("Vehicle Exit: " + vehicle + " | Remaining Vehicles: " + parking.size());
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
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingManagement pm = new ParkingManagement();
		service.submit(pm.entry);
		service.submit(pm.exit);

	}
}
