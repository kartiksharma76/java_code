package javaDsaPattern;

import java.util.LinkedList;
import java.util.Queue;

public class QueueC {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		// Enqueue(Insert)

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);

		System.out.println("Queue: " + queue);

		// Front Element
		System.out.println("Front: " + queue.peek());

		// Dequeue (Delete)
		System.out.println("Removed: " + queue.poll());

		System.out.println("Queue After Dequeue: " + queue);

		// Size
		System.out.println("Size: " + queue.size());

		// Search
		System.out.println("Contains 20: " + queue.contains(20));

		// Is Empty
		System.out.println("Is Empty: " + queue.isEmpty());

		// Display
		System.out.print("Elements: ");
		for (int i : queue) {
			System.out.print(i + " ");
		}

		// Clear
		queue.clear();
		System.out.println("\nAfter Clear: " + queue);

	}
}
