package Locking;

import java.util.concurrent.locks.ReentrantLock;
import java.time.LocalTime;

public class Flight {
	private final boolean[] seats = new boolean[51]; // index 1–50
	private final ReentrantLock lock = new ReentrantLock();
	private final int ticketPrice = 1500;
	private final LocalTime startTime = LocalTime.of(9, 0);
	private final LocalTime endTime = LocalTime.of(17, 0);

	public void bookSeat(int seatNumber, String user, boolean hasPassbook) {
		if (!hasPassbook) {
			System.out.println(user + " is not eligible to book. Passbook required.");
			return;
		}

		lock.lock();
		try {
			if (!seats[seatNumber]) {
				seats[seatNumber] = true;
				System.out.println(user + " successfully booked seat " + seatNumber +
						" | Ticket Price: ₹" + ticketPrice +
						" | Schedule: " + startTime + " to " + endTime);
			} else {
				System.out.println("Seat " + seatNumber + " is already booked");
			}
		} finally {
			lock.unlock();
		}
	}

	public void cancelSeat(int seatNumber, String user) {
		lock.lock();
		try {
			if (seats[seatNumber]) {
				seats[seatNumber] = false;
				System.out.println(user + " cancelled seat " + seatNumber);
			} else {
				System.out.println("Seat " + seatNumber + " is not booked yet");
			}
		} finally {
			lock.unlock();
		}
	}
}

