package AdvanceThreading;
/**
 *                 ParkingManagementSystemEX
 *                          |
 *                   ExecutorService
 *                  /       |       \
 *                 /        |        \
 *         EntryGate     ExitGate    ...
 *              |           |
 *              v           v
 *         parkVehicle()  exitVehicle()
 *              |            |
 *              +------ ParkingLot ------+
 *                      |
 *         +-----------+-----------+
 *         |           |           |
 *     ReentrantLock Semaphore  AtomicInteger
 *         |
 *    +----+----+
 *    |         |
 * notFull   notEmpty
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
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// ----------------------VECHICLE-----------------------
class Vehicle {
    private final String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

//------------------- TICKET----------------------
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

// -----------------PARKING LOT ------------------
class ParkingLot {
    private final int capacity;
    private final Queue<Ticket> parkingSlots = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private final Semaphore entryGate = new Semaphore(1);
    private final AtomicInteger totalVehicles = new AtomicInteger(0);

    private final double ratePreHour = 20.0;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public void parkVehicle(Vehicle vehicle) throws InterruptedException {
        entryGate.acquire();
        lock.lock();
        try {
            while (parkingSlots.size() == capacity) {
                System.out.println("Paking full ... waiting");
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

    public void exitVehicle() throws InterruptedException {
        lock.lock();
        try {
            while (parkingSlots.isEmpty()) {
                System.out.println("No vehicles.... exit waiting");
                notEmpty.await();
            }
            Ticket ticket = parkingSlots.poll();
            totalVehicles.decrementAndGet();

            LocalDateTime exitTime = LocalDateTime.now();
            long seconds = Duration.between(ticket.getEntryTime(), exitTime).getSeconds();
            double hours = Math.ceil(seconds / 3600.0);
            if (hours < 1)
                hours = 1;

            double amount = hours * ratePreHour;

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

// ---------------------- ENTRY THREAD --------------------
class EntryGate implements Runnable {
    private final ParkingLot parkingLot;

    EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Vehicle vehicle = new Vehicle("CAR-" + ThreadLocalRandom.current().nextInt(1000));
                parkingLot.parkVehicle(vehicle);
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

//------------------------- MAIN ----------------------
public class ParkingManagementSystemEX {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot = new ParkingLot(5);
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new EntryGate(parkingLot));
        service.submit(new EntryGate(parkingLot));
        service.submit(new ExitGate(parkingLot));
        service.submit(new ExitGate(parkingLot));

        Thread.sleep(40000);
        service.shutdownNow();
        System.out.println("\n Parking System Shutdown");

    }
}
