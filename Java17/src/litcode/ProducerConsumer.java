package litcode;

import java.util.*;

class SharedBuffer {
	Queue<Integer> queue = new LinkedList<>();
	int capacity = 5;

	public synchronized void produce(int value) throws InterruptedException {
		while (queue.size() == capacity)
			wait();

		queue.add(value);
		System.out.println("Produced: " + value);
		notifyAll();
	}

	public synchronized void consume() throws InterruptedException {
		while (queue.isEmpty())
			wait();

		int val = queue.remove();
		System.out.println("Consumed: " + val);
		notifyAll();
	}
}

public class ProducerConsumer {
	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer();

		Thread producer = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					buffer.produce(i);
					Thread.sleep(2000);
				} catch (Exception e) {
				}
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					buffer.consume();
					Thread.sleep(4000);
				} catch (Exception e) {
				}
			}
		});

		producer.start();
		consumer.start();
	}
}
