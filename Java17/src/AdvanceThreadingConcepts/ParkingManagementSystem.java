package AdvanceThreadingConcepts;
/**
------------------------------------------------
| Concept                | Where                |   
| ---------------------- | -------------------- |
| Thread                 | Entry & Exit threads |
| Runnable               | Gate classes         |
| ExecutorService        | Thread pool          |
| Synchronization        | Lock mechanism       |
| wait() equivalent      | Condition.await()    |
| notifyAll() equivalent | signalAll()          |
| Semaphore              | Entry restriction    |
| ReentrantLock          | Manual locking       |
| Condition              | notFull / notEmpty   |
| AtomicInteger          | Thread-safe counter  |
| Graceful shutdown      | shutdownNow()        |
-------------------------------------------------
 */

/*
===============================================
        PARKING MANAGEMENT SYSTEM
        MULTITHREADING ALGORITHM
===============================================

ALGORITHM:

1️  SYSTEM INITIALIZATION
--------------------------------
1. Start the program.
2. Set parking capacity (e.g., 5 slots).
3. Initialize:
   - Parking queue (empty)
   - Rate per hour (₹20)
   - Lock mechanism
   - Conditions:
        a) notFull
        b) notEmpty
   - Semaphore for entry control
4. Create thread pool using ExecutorService.

------------------------------------------------

2️  ENTRY PROCESS (PRODUCER THREAD)
--------------------------------------
Repeat until system shutdown:

1. Acquire semaphore (only one vehicle enters at a time).
2. Acquire lock.
3. If parking is FULL:
      - Print "Parking Full"
      - Wait on notFull condition.
4. Else:
      - Create Vehicle object.
      - Generate Ticket with:
            * Unique Ticket ID
            * Entry Time
      - Add ticket to parking queue.
      - Increment total vehicle counter.
      - Print entry details.
      - Signal notEmpty condition.
5. Release lock.
6. Release semaphore.
7. Sleep for few seconds.

------------------------------------------------

3️  EXIT PROCESS (CONSUMER THREAD)
--------------------------------------
Repeat until system shutdown:

1. Acquire lock.
2. If parking is EMPTY:
      - Print "No vehicles to exit"
      - Wait on notEmpty condition.
3. Else:
      - Remove ticket from queue.
      - Decrement vehicle counter.
      - Get current time as Exit Time.
      - Calculate parking duration:

            totalMinutes = exitTime - entryTime

      - Convert into billable hours:

            hours = ceil(totalMinutes / 60)

      - If hours == 0:
            hours = 1   (Minimum charge)

      - Calculate amount:

            amount = hours × ratePerHour

      - Print bill details.
      - Signal notFull condition.
4. Release lock.
5. Sleep for few seconds.

------------------------------------------------

4️  BILLING LOGIC
--------------------
1. Calculate time difference.
2. Convert duration into minutes.
3. Divide by 60.
4. Round up using ceiling function.
5. Multiply by hourly rate.
6. Display total payable amount.

------------------------------------------------

5️  SYSTEM SHUTDOWN
----------------------
1. After fixed running time:
      - Interrupt all threads.
      - Shutdown ExecutorService.
2. Print "System Shutdown".
3. End program.

===============================================
Threading Concepts Used:
- Thread / Runnable
- ExecutorService
- Semaphore
- ReentrantLock
- Condition (wait/notify mechanism)
- Producer-Consumer Pattern
- Atomic Counter
===============================================
*/
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//---------------- VEHICLE ----------------
class Vehicle {
 private final String vehicleNumber;

 public Vehicle(String vehicleNumber) {
     this.vehicleNumber = vehicleNumber;
 }

 public String getVehicleNumber() {
     return vehicleNumber;
 }
}

//---------------- TICKET ----------------
class Ticket {
	private final String ticketId;
	private final Vehicle vehicle;
	private final LocalDateTime entryTime;

	public Ticket(Vehicle vehicle) {
		this.ticketId = UUID.randomUUID().toString();
		this.vehicle = vehicle;
		this.entryTime = LocalDateTime.now();
	}

	public String getTicketId() {
		return ticketId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}
}

//---------------- PARKING LOT ----------------
class ParkingLot {

	private final int capacity;
	private final Queue<Ticket> parkingSlots = new LinkedList<>();

	private final ReentrantLock lock = new ReentrantLock();
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();

	private final Semaphore entryGate = new Semaphore(1);
	private final AtomicInteger totalVehicles = new AtomicInteger(0);

	private final double ratePerHour = 20.0;

	public ParkingLot(int capacity) {
		this.capacity = capacity;
	}

	// ENTRY
	public void parkVehicle(Vehicle vehicle) throws InterruptedException {

		entryGate.acquire();

		lock.lock();
		try {
			while (parkingSlots.size() == capacity) {
				System.out.println("Parking Full... waiting");
				notFull.await();
			}

			Ticket ticket = new Ticket(vehicle);
			parkingSlots.add(ticket);
			totalVehicles.incrementAndGet();

			System.out.println("\nENTRY -> " + vehicle.getVehicleNumber());
			System.out.println("Entry Time -> " + ticket.getEntryTime());
			System.out.println("Total Vehicles -> " + totalVehicles.get());

			notEmpty.signalAll();

		} finally {
			lock.unlock();
			entryGate.release();
		}
	}

	// EXIT + BILLING
	public void exitVehicle() throws InterruptedException {

		lock.lock();
		try {
			while (parkingSlots.isEmpty()) {
				System.out.println("No vehicles... exit waiting");
				notEmpty.await();
			}

			Ticket ticket = parkingSlots.poll();
			totalVehicles.decrementAndGet();

			LocalDateTime exitTime = LocalDateTime.now();

			long seconds = Duration.between(ticket.getEntryTime(), exitTime).getSeconds();

			double hours = Math.ceil(seconds / 3600.0);
			if (hours < 1)
				hours = 1;

			double amount = hours * ratePerHour;

			System.out.println("\nEXIT -> " + ticket.getVehicle().getVehicleNumber());
			System.out.println("Exit Time -> " + exitTime);
			System.out.println("Seconds Parked -> " + seconds);
			System.out.println("Billable Hours -> " + hours);
			System.out.println("Amount -> ₹" + amount);
			System.out.println("Remaining Vehicles -> " + totalVehicles.get());

			notFull.signalAll();

		} finally {
			lock.unlock();
		}
	}
}

//---------------- ENTRY THREAD ----------------
class EntryGate implements Runnable {

	private final ParkingLot parkingLot;

	public EntryGate(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {

				Vehicle vehicle = new Vehicle("CAR-" + ThreadLocalRandom.current().nextInt(1000));

				parkingLot.parkVehicle(vehicle);

				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

//---------------- EXIT THREAD ----------------
class ExitGate implements Runnable {

	private final ParkingLot parkingLot;

	public ExitGate(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {

				parkingLot.exitVehicle();

				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

//---------------- MAIN ----------------
public class ParkingManagementSystem {

	public static void main(String[] args) throws InterruptedException {

		ParkingLot parkingLot = new ParkingLot(5);

		ExecutorService service = Executors.newFixedThreadPool(4);

		service.submit(new EntryGate(parkingLot));
		service.submit(new EntryGate(parkingLot));
		service.submit(new ExitGate(parkingLot));
		service.submit(new ExitGate(parkingLot));

		Thread.sleep(40000);

		service.shutdownNow();
		System.out.println("\n🚗 Parking System Shutdown.");
	}
}
