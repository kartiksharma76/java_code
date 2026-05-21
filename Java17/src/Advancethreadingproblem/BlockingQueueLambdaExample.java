package Advancethreadingproblem;

import java.util.concurrent.*;

public class BlockingQueueLambdaExample {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		Thread producer = new Thread(() -> {

			try {

				for (int i = 1; i <= 5; i++) {

					queue.put(i);

					System.out.println("Produced : " + i);
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		});

		Thread consumer = new Thread(() -> {

			try {

				for (int i = 1; i <= 5; i++) {

					int value = queue.take();

					System.out.println("Consumed : " + value);
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		});

		producer.start();
		consumer.start();
	}
}