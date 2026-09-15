package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MinQueue {
	private Queue<Integer> queue;
	private Deque<Integer> MinQueue;

	public MinQueue() {
		queue = new LinkedList<>();
		MinQueue = new ArrayDeque<>();
	}

	public void enqueue(int data) {
		queue.add(data);

		while (!MinQueue.isEmpty() && MinQueue.peek() > data) {
			MinQueue.pollLast();
		}
		MinQueue.addLast(data);
	}

// Dequeue operation
	public int dequeue() {
		if (queue.isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		int removed = queue.poll();

		// If the dequeued element is the minimum, remove it from minQueue
		if (removed == MinQueue.peek()) {
			MinQueue.pollFirst();
		}

		return removed; 
	}

// Get the minimum element
	public int getMin() {
		if (MinQueue.isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return MinQueue.peekFirst();
	}

// Check if the queue is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
