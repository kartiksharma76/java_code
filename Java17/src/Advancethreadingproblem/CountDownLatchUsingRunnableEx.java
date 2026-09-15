package Advancethreadingproblem;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchUsingRunnableEx {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(4);
		Runnable passanger = () -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();

			if (latch.getCount() == 0) {
				System.out.println("start the train");
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 4; i++) {
			service.submit(passanger);
		}
		Thread.sleep(2000);
		System.out.println("latch count" + latch.getCount());
		service.shutdown();
	}
}
