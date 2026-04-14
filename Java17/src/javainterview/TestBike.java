package javainterview;

public class TestBike {
	public static void main(String[] args) {

		// Create Bicycle object
		Bicycle b1 = new Bicycle(50, 10, 3);
		System.out.println("Bicycle Details:");
		System.out.println("Cadence: " + b1.cadence);
		System.out.println("Speed: " + b1.speed);
		System.out.println("Gear: " + b1.gear);

		// Using methods
		b1.applyBrake(2);
		b1.speedUp(5);
		System.out.println("After changes, Speed: " + b1.speed);

		System.out.println("----------------------");

		// Create MountainBike object
		MountainBike m1 = new MountainBike(20, 60, 15, 4);
		System.out.println("MountainBike Details:");
		System.out.println("Seat Height: " + m1.seatHeight);
		System.out.println("Cadence: " + m1.cadence);
		System.out.println("Speed: " + m1.speed);
		System.out.println("Gear: " + m1.gear);

		// Using subclass method
		m1.setHeight(25);
		System.out.println("Updated Seat Height: " + m1.seatHeight);

	}
}
