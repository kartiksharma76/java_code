package Locking;

public class UserRunnable implements Runnable {
	private final Flight flight;
	private final String operation;
	private final int seatNumber;
	private final boolean hasPassbook;
	private final String userName;

	public UserRunnable(Flight flight, String operation, int seatNumber, boolean hasPassbook, String userName) {
		this.flight = flight;
		this.operation = operation;
		this.seatNumber = seatNumber;
		this.hasPassbook = hasPassbook;
		this.userName = userName;
	}

	@Override
	public void run() {
		if (operation.equalsIgnoreCase("book")) {
			flight.bookSeat(seatNumber, userName, hasPassbook);
		} else if (operation.equalsIgnoreCase("cancel")) {
			flight.cancelSeat(seatNumber, userName);
		}
	}

}
