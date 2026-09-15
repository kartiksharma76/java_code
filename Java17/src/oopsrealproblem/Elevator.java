package oopsrealproblem;

import java.util.PriorityQueue;

public class Elevator {
	private int id;
	private int currentFloor;
	private Direction direction;
	private ElevatorState state;

	private PriorityQueue<Integer> upQueue = new PriorityQueue<>();
	private PriorityQueue<Integer> downQueue = new PriorityQueue<>((a, b) -> b - a);

	public Elevator(int id) {
		this.id = id;
		this.currentFloor = 0;
		this.direction = Direction.IDLE;
		this.state = ElevatorState.IDLE;

	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public Direction getDirection() {
		return direction;
	}

	public void addRequest(int floor) {
		if (floor > currentFloor) {
			upQueue.offer(floor);

		} else {
			downQueue.offer(floor);
		}
	}

	public void move() {
		if (!upQueue.isEmpty()) {
			direction = Direction.UP;
			state = ElevatorState.MOVING;
			currentFloor = upQueue.poll();
		} else if (!downQueue.isEmpty()) {
			direction = Direction.DOWN;
			state = ElevatorState.MOVING;
			currentFloor = downQueue.poll();
		} else {
			direction = Direction.IDLE;
			state = ElevatorState.IDLE;
		}

		System.out.println("Elevator " + id + " moved to floor " + currentFloor);

	}

}
