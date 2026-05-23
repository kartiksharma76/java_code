package InfosysSpringboard;

class MovieTicket {

	// Instance variables
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;

	// Parameterized constructor
	public MovieTicket(int movieId, int noOfSeats) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}

	// Getter and Setter methods
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerTicket() {
		return costPerTicket;
	}

	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}

	// Method to calculate total amount
	public double calculateTotalAmount() {

		// Setting ticket price based on movieId
		if (movieId == 111) {
			costPerTicket = 7;
		} else if (movieId == 112) {
			costPerTicket = 8;
		} else if (movieId == 113) {
			costPerTicket = 8.5;
		} else {
			return -1;
		}

		// Calculate total with 2% tax
		double totalAmount = (costPerTicket * noOfSeats);
		totalAmount = totalAmount + (totalAmount * 0.02);

		// Return rounded value
		return Math.round(totalAmount);
	}
}

class Movie {

	public static void main(String[] args) {

		MovieTicket movieTicket = new MovieTicket(112, 3);

		double amount = movieTicket.calculateTotalAmount();

		if (amount == -1) {
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		} else {
			System.out.println("Total amount for booking : $" + amount);
		}
	}
}