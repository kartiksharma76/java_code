package oopsrealproblem;

import java.util.Arrays;

public class ElevatorSystem {
	public static void main(String[] args) {

		Elevator e1 = new Elevator(1);
		Elevator e2 = new Elevator(2);

		ElevatorController controller = new ElevatorController(Arrays.asList(e1, e2));

		Request r1 = new Request(5, Direction.UP);
		Request r2 = new Request(2, Direction.DOWN);

		Elevator assigned1 = controller.assignElevator(r1);
		Elevator assigned2 = controller.assignElevator(r2);

		assigned1.move();
		assigned2.move();
	}
}
