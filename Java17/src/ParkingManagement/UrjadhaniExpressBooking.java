package ParkingManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrjadhaniExpressBooking {
	static final int TOTAL_SEATS = 100;
	static final int TICKET_PRICE = 400;
	static final double SENIOR_DISCOUNT = 0.5;
	static final int PENALTY_NO_TICKET = 2000;
	static int bookedSeats = 0;
	static int penaltyCount = 0;
	static int waitingCount = 0;
	static int confirmedCount = 0;
	static final Object seatLock = new Object();

	public static class Passenger implements Runnable {
		String name;
		int age;
		boolean hasTicket;

		Passenger(String name, int age, boolean hasTicket) {
			this.name = name;
			this.age = age;
			this.hasTicket = hasTicket;
		}

		public int calculateFare() {
			if (!hasTicket) {
				return PENALTY_NO_TICKET;
			}
			if (age <= 6) {
				return 0;
			}
			if (age > 59) {
				return (int) (TICKET_PRICE * SENIOR_DISCOUNT);
			}
			return TICKET_PRICE;
		}

		public String getSeatStatus() {
			if (!hasTicket) {
				synchronized (seatLock) {
					penaltyCount++;
				}
				return "Penalty Applied (No Ticket)";
			}

			synchronized (seatLock) {
				if (bookedSeats < TOTAL_SEATS) {
					bookedSeats++;
					confirmedCount++;
					return "Confirmed Seat " + bookedSeats;
				} else {
					waitingCount++;
					return "Waiting List";
				}
			}
		}

		@Override
		public void run() {
			System.out.println("\nProcessing booking for " + name + " (Age: " + age + ")");
			int fare = calculateFare();
			String status = getSeatStatus();
			System.out.println("Fare: ₹" + String.format("%,d", fare));
			System.out.println("Seat Status: " + status);
		}
	}

	public static class TrainRunnable implements Runnable {
		class Stop {
			String name;
			String time;
			int stopDurationSeconds;

			Stop(String name, String time, int stopDurationSeconds) {
				this.name = name;
				this.time = time;
				this.stopDurationSeconds = stopDurationSeconds;
			}
		}

		List<Stop> route = List.of(new Stop("Sarai Gram", "8:30 PM", 2), new Stop("Khanna Banjari", "9:45 PM", 2),
				new Stop("Katni", "11:30 PM", 30), new Stop("Sagar", "2:00 AM", 10), new Stop("Vidisha", "4:30 AM", 2),
				new Stop("Bhopal", "5:30 AM", 0));

		@Override
		public void run() {
			System.out.println("\nTrain: Urjadhani Express is starting from Singrauli at 7:30 PM\n");

			try {
				for (Stop stop : route) {
					Thread.sleep(2000); // Simulate travel
					System.out.println("Arrived at " + stop.name + " at " + stop.time + " | Stopping for "
							+ stop.stopDurationSeconds + " minutes...");
					Thread.sleep(stop.stopDurationSeconds * 1000); // Simulate stop
					if (!stop.name.equals("Bhopal")) {
						System.out.println("Departing " + stop.name + "\n");
					}
				}
				System.out.println("Train has reached the final destination: Bhopal at 5:30 AM.");
			} catch (InterruptedException e) {
				System.out.println("Train journey interrupted!");
			}
		}
	}

	public static void printSchedule() {
		System.out.println("Train: Urjadhani Express");
		System.out.println("Departure: 7:30 PM from Singrauli");
		System.out.println("Arrival: 5:30 AM at Bhopal");
		System.out.println("Stops:");
		System.out.println(" - Sarai Gram: 8:30 PM (Stop 2 mins)");
		System.out.println(" - Khanna Banjari: 9:45 PM (Stop 2 mins)");
		System.out.println(" - Katni: 11:30 PM (Stop 30 mins)");
		System.out.println(" - Sagar: 2:00 AM (Stop 10 mins)");
		System.out.println(" - Vidisha: 4:30 AM (Stop 2 mins)");
		System.out.println(" - Bhopal: 5:30 AM");
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printSchedule();

		System.out.print("Enter number of passengers: ");
		int n = sc.nextInt();
		sc.nextLine();

		List<Thread> threads = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nPassenger " + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();

			int age;
			while (true) {
				System.out.print("Age: ");
				age = sc.nextInt();
				if (age >= 0)
					break;
				System.out.println("Invalid age! Try again.");
			}

			boolean hasTicket;
			while (true) {
				System.out.print("Has valid ticket (true/false)? ");
				if (sc.hasNextBoolean()) {
					hasTicket = sc.nextBoolean();
					break;
				} else {
					System.out.println("Invalid input. Please enter true or false.");
					sc.next(); // clear invalid input
				}
			}
			sc.nextLine(); // consume newline

			Passenger passenger = new Passenger(name, age, hasTicket);
			Thread t = new Thread(passenger, "Passenger-" + i);
			threads.add(t);
			t.start();
		}

		// Wait for all passenger threads to finish
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Start train journey
		Thread trainThread = new Thread(new TrainRunnable());
		trainThread.start();
		try {
			trainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Final booking summary
		System.out.println("\n--- Booking Summary ---");
		System.out.println("Total Confirmed Seats: " + confirmedCount);
		System.out.println("Waiting List Count: " + waitingCount);
		System.out.println("Penalties Applied (No Ticket): " + penaltyCount);
		System.out.println("\nAll bookings processed and train journey completed.");
		sc.close();
	}
}
