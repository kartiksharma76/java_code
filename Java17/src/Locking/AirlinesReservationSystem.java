package Locking;

import java.util.Random;

public class AirlinesReservationSystem {
	public static void main(String[] args) {
		Flight flight = new Flight();
		Random random = new Random();

		int userCounter = 1;

		while (true) {
			String operation = random.nextBoolean() ? "book" : "cancel";
			int seatNumber = 1 + random.nextInt(50); // seat 1 to 50
			boolean hasPassbook = random.nextBoolean();
			String userName = "User" + userCounter++;

			Thread thread = new Thread(new UserRunnable(flight, operation, seatNumber, hasPassbook, userName));
			thread.start();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
