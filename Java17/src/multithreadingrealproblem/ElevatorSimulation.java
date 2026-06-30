package multithreadingrealproblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Elevator {

	private final BlockingQueue<Integer> requests = new ArrayBlockingQueue<>(10);

	public void requestLift(int floor) {

		try {

			requests.put(floor);

			System.out.println(Thread.currentThread().getName() + " requested Floor " + floor);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}

	public void processRequest() {

		try {

			while (true) {

				int floor = requests.take();

				System.out.println("\nElevator moving to Floor " + floor);

				Thread.sleep(2000);

				System.out.println("Reached Floor " + floor);
			}

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}
}

public class ElevatorSimulation {

	public static void main(String[] args) throws InterruptedException {

		Elevator elevator = new Elevator();

		Thread elevatorThread = new Thread(elevator::processRequest);

		elevatorThread.start();

		Thread p1 = new Thread(() -> elevator.requestLift(3), "Person-1");

		Thread p2 = new Thread(() -> elevator.requestLift(7), "Person-2");

		Thread p3 = new Thread(() -> elevator.requestLift(2), "Person-3");

		Thread p4 = new Thread(() -> elevator.requestLift(10), "Person-4");

		Thread p5 = new Thread(() -> elevator.requestLift(5), "Person-5");

		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();

		p1.join();
		p2.join();
		p3.join();
		p4.join();
		p5.join();

		Thread.sleep(12000);

		elevatorThread.interrupt();

		System.out.println("\nSimulation Finished.");
	}
}