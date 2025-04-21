package Locking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ParkingManagement2 {
	public static int capacity = 10;
	Map<String, LocalDateTime> parking = new LinkedHashMap<>();
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	Duration freeofcost = Duration.ofMinutes(45);
	int extracostper45minute = 50;

	Runnable entryofvehicle = () -> {
		Random random = new Random();
		while (true) {
			lock.lock();
			try {
				while (parking.size() == capacity) {
					System.out.println("EntryBlock: parking is full");
					condition.await();
				}

				String vehicle = "car-" + Thread.currentThread().getId() + System.nanoTime();
				long randomMinuteAgo = 30 + random.nextInt(200);
				LocalDateTime entrytime = LocalDateTime.now().minusMinutes(randomMinuteAgo);

				parking.put(vehicle, entrytime);
				System.out.println(
						"Entered vehicle: " + vehicle + " at " + entrytime + " | Total vehicles: " + parking.size());

				condition.signal();

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		}
	};
	Runnable exitOfvehicle = () -> {
		Random random = new Random();
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

				long cost = calculatewaitcarParkingCost(entryTime, exitTime);

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

	private long calculatewaitcarParkingCost(LocalDateTime entryTime, LocalDateTime exitTime) {
		Duration parkedDuration = Duration.between(entryTime, exitTime);
		if (parkedDuration.compareTo(freeofcost) <= 0) {
			return 0;
		}
		Duration extraTime = parkedDuration.minus(freeofcost);
		long extraBlocks = (extraTime.toMinutes() + 44) / 45;
		return extraBlocks * extracostper45minute;
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingManagement2 pm = new ParkingManagement2();
		service.submit(pm.entryofvehicle);
		service.submit(pm.exitOfvehicle);
	}
}
