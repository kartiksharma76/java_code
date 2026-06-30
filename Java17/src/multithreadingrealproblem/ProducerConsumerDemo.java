package multithreadingrealproblem;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
	private final Queue<Integer> queue = new LinkedList<>();
	private final int capacity = 5;
	private int value = 1;

	public synchronized void produce() {
		while (true) {
			while (queue.size() == capacity) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}
			System.out.println("Produced :" + value);
			queue.add(value++);
			notifyAll();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
	}

	public synchronized void consume() {
		while (true) {
			while (queue.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}
			int item = queue.poll();
			System.out.println("Consumed : " + item);
			notifyAll();

			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
	}
}

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer();
		Thread producer = new Thread(() -> buffer.produce(), "Producer");
		Thread consumer = new Thread(() -> buffer.consume(), "Consumer");

		producer.start();
		consumer.start();
	}
}
