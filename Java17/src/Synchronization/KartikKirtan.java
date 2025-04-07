package Synchronization;

import java.util.ArrayList;
import java.util.List;

public class KartikKirtan {
	private static int capacity = 10;
	List<Integer> basket = new ArrayList<>();
	Runnable Kartik = () -> {
		while (true) {
			synchronized (basket) {
				while (basket.size() == capacity) {
					try {
						basket.wait(); // basket me item nahi dal sakte(producer)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int item = 10;// basket me item dalo (producer)
				basket.add(item);
				System.out.println("Produced by Kartik: " + item);
				basket.notify();// Kartik notify karega kirtan ko
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	Runnable kirtan = () -> {
		while (true) {
			synchronized (basket) {
				while (basket.isEmpty()) {
					try {
						basket.wait(); // basket se item nahi le sakte(consumer)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int item = basket.remove(0);// basket se item le lo(consumer)
				System.out.println("Consumed by Twinkle: " + item);
				basket.notify();// basket se item le lo(consumer)
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public static void main(String[] args) {
		KartikKirtan kt = new KartikKirtan();
		Runnable procedure = kt.Kartik;
		Runnable consumer = kt.kirtan;
		Thread t1 = new Thread(procedure);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}
}
