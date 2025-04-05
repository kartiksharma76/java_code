package Synchronization;

import java.util.ArrayList;
import java.util.List;

// procedure=kartik
//consumer=twinkle
public class PredecureConsumer {
	private static int capacity = 10;
	private List<Integer> basket = new ArrayList<>();
	Runnable producer = () -> {
		while (true) {
			synchronized (basket) {
				while (basket.size() == capacity) {
					try {
						basket.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int item = 10;
				basket.add(item);
				System.out.println("Produced by Kartik: " + item);
				basket.notify();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	Runnable consumer = () -> {
		while (true) {
			synchronized (basket) {
				while (basket.isEmpty()) {
					try {
						basket.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int item = basket.remove(0);
				System.out.println("Consumed by Twinkle: " + item);
				basket.notify();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {
		PredecureConsumer pc = new PredecureConsumer();
		Runnable producer1 = pc.producer;
		Runnable consumer1 = pc.consumer;
		Thread t1 = new Thread(producer1);
		Thread t2 = new Thread(consumer1);
		t1.start();
		t2.start();
	}
}
