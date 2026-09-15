package Locking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ParkingManagementUsingAdvanceThreading {
	public static int capacity = 10;
	List<String> parking = new ArrayList<>();
	ReentrantLock lock = new ReentrantLock();
	Condition notFull = lock.newCondition();
	Condition notEmpty = lock.newCondition();

	Runnable entry = () -> {
		while (true) {
			lock.lock();
			try {
				while (parking.size() == capacity) {
					System.out.println("Entry blocked: Parking full");
					notFull.await();
				}
				String vehicle = "car-" + Thread.currentThread().getId();
				parking.add(vehicle);
				System.out.println("Vehicle Entered: " + vehicle + " | Total Vehicles: " + parking.size());
				notEmpty.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();

			} finally {
				lock.unlock();
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
			lock.lock();
			try {
				while (parking.isEmpty()) {
					System.out.println("Exit waiting: No vehicles to exit");
					notEmpty.await();
				}
				String vehicle = parking.remove(0);
				System.out.println("Vehicle Exit: " + vehicle + " | Remaining Vehicles: " + parking.size());
				notFull.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
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
		ParkingManagementUsingAdvanceThreading pm = new ParkingManagementUsingAdvanceThreading();
		service.submit(pm.entry);
		service.submit(pm.exit);
	}
}
