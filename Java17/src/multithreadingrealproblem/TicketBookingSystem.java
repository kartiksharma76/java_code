package multithreadingrealproblem;

class TicketCounter {
	private int avliableSeats = 10;

	public synchronized void bookTicket(int seats) {
		System.out.println("\n" + Thread.currentThread().getName() + " is trying to book " + seats + " seat(s)...");

		if (avliableSeats >= seats) {
			System.out.println("Booking Successful!");

			avliableSeats -= seats;

			System.out.println("Remaining Seats : " + avliableSeats);
		} else {
			System.out.println("Booking Failed!");
			System.out.println("Only " + avliableSeats + " seat(s) available.");
		}
	}
}

public class TicketBookingSystem {
	public static void main(String[] args) throws InterruptedException {
		TicketCounter counter = new TicketCounter();
		Thread user1 = new Thread(() -> counter.bookTicket(4), "User-1");
		Thread user2 = new Thread(() -> counter.bookTicket(5), "User-2");

		Thread user3 = new Thread(() -> counter.bookTicket(3), "User-3");

		user1.start();
		user2.start();
		user3.start();

		user1.join();
		user2.join();
		user3.join();

		System.out.println("\nAll booking requests processed.");
	}
}
