package AdvanceThreadingConcepts;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample2 {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime startTime = LocalDateTime.now();
		System.out.println("Process started...");
		CountDownLatch latch = new CountDownLatch(4);
		Runnable passenger = () -> {
			System.out.println(Thread.currentThread().getName() + " has arrived");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
		};
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 4; i++) {
			service.submit(passenger);
		}
		latch.await();
		System.out.println("All passengers have arrived, start the car!");
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("Process ended..." + endTime);

		service.shutdown();
	}
}