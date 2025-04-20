package Locking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ParkingManagement {
	public static int capacity = 10;
	Map<String, LocalDateTime> parking = new LinkedHashMap<>();
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	Duration freelimit = Duration.ofMinutes(30);// in here free of parking only one hour and it take extra hour give
												// extra
	// charge
	int extracostper30minute = 100;// ₹100 for every extra hour cost free limit.

//	Waits if parking is full.
//	Generates a vehicle ID.
//	Sets a random entry time (30–200 mins ago).
//	Adds the vehicle to the parking map.
//	Notifies the exit thread using condition.signal().
//	 Sleeps for 2 seconds before simulating the next vehicle entry
	Runnable entry = () -> {
		Random random = new Random();
		while (true) {
			lock.lock();
			try {
				while (parking.size() == capacity) {// if the check the capacity is full then entry block parking is
													// full
					System.out.println("Entry blocked: Parking full");
					condition.await();
				}

				String vehicle = "car-" + Thread.currentThread().getId() + "-" + System.nanoTime();

				long randomMinutesAgo = 30 + random.nextInt(200); // 30 to 200 minutes
				LocalDateTime entrytime = LocalDateTime.now().minusMinutes(randomMinutesAgo);

				parking.put(vehicle, entrytime);// to store a vehicleID and entry time value
				System.out.println(
						"Vehicle Entered: " + vehicle + " at " + entrytime + " | Total Vehicles: " + parking.size());

				condition.signal();
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
//	Waits if parking is empty.
//	Removes the first vehicle from the map.
//	Calculates how long the vehicle was parked.
//	Computes parking cost:
//	Free if within 1 hour.
//	₹100 per extra hour (rounded up).
//	Notifies the entry thread.
	Runnable exit = () -> {
		while (true) {
			lock.lock();
			try {
				while (parking.isEmpty()) {
					System.out.println("Exit waiting: No vehicles to exit");
					condition.await();
				}

				String vehicle = parking.keySet().iterator().next();
				LocalDateTime entryTime = parking.remove(vehicle);
				LocalDateTime exitTime = LocalDateTime.now();

				long cost = calculateParkingCost(entryTime, exitTime);

				System.out.println("Vehicle Exit: " + vehicle + " at " + exitTime + " | Parked Duration: "
						+ Duration.between(entryTime, exitTime).toMinutes() + " mins" + " | Cost: " + cost
						+ " | Remaining Vehicles: " + parking.size());

				condition.signal();
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

//Calculates the duration between entry and exit.
	private long calculateParkingCost(LocalDateTime entryTime, LocalDateTime exitTime) {
		Duration parkedDuration = Duration.between(entryTime, exitTime);

		if (parkedDuration.compareTo(freelimit) <= 0) {
			return 0;
		}

		Duration extraTime = parkedDuration.minus(freelimit);
		long extraHours = (extraTime.toMinutes() + 59) / 60;

		return extraHours * extracostper30minute;
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingManagement pm = new ParkingManagement();
		service.submit(pm.entry);
		service.submit(pm.exit);
	}
}
