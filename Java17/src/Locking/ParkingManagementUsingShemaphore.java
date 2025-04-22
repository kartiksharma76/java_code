package Locking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ParkingManagementUsingShemaphore {
	public static int capacity = 10;
	Map<String, LocalDateTime> parking = new LinkedHashMap<>();
	Semaphore semaphore = new Semaphore(capacity, true); // Fair semaphore

	Duration freelimit = Duration.ofMinutes(30);
	int extracostper30minute = 100;

	// Entry thread using semaphore
	Runnable entry = () -> {
		Random random = new Random();
		while (true) {
			try {
				semaphore.acquire(); // Wait if parking is full
				String vehicle = "car-" + Thread.currentThread().getId() + "-" + System.nanoTime();
				long randomMinutesAgo = 30 + random.nextInt(200);
				LocalDateTime entrytime = LocalDateTime.now().minusMinutes(randomMinutesAgo);

				synchronized (parking) {
					parking.put(vehicle, entrytime);
					System.out.println("Vehicle Entered: " + vehicle + " at " + entrytime + " | Total Vehicles: "
							+ parking.size());
				}

				Thread.sleep(2000); // Simulate delay for next vehicle
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	// Exit thread using semaphore
	Runnable exit = () -> {
		while (true) {
			String vehicle = null;
			LocalDateTime entryTime = null;

			synchronized (parking) {
				if (!parking.isEmpty()) {
					vehicle = parking.keySet().iterator().next();
					entryTime = parking.remove(vehicle);
				}
			}

			if (vehicle != null && entryTime != null) {
				LocalDateTime exitTime = LocalDateTime.now();
				long cost = calculateParkingCost(entryTime, exitTime);

				System.out.println("Vehicle Exit: " + vehicle + " at " + exitTime + " | Parked Duration: "
						+ Duration.between(entryTime, exitTime).toMinutes() + " mins | Cost: " + cost
						+ " | Remaining Vehicles: " + parking.size());

				semaphore.release(); // Free up a slot
			} else {
				System.out.println("Exit waiting: No vehicles to exit");
			}

			try {
				Thread.sleep(3000); // Simulate delay between exits
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	private long calculateParkingCost(LocalDateTime entryTime, LocalDateTime exitTime) {
		Duration parkedDuration = Duration.between(entryTime, exitTime);
		if (parkedDuration.compareTo(freelimit) <= 0)
			return 0;

		Duration extraTime = parkedDuration.minus(freelimit);
		long extraHours = (extraTime.toMinutes() + 59) / 60;
		return extraHours * extracostper30minute;
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingManagementUsingShemaphore pm = new ParkingManagementUsingShemaphore();
		service.submit(pm.entry);
		service.submit(pm.exit);
	}
}
