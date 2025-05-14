package AdvanceThreadingConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CountDownLatch latch = new CountDownLatch(4);
		ExecutorService service = Executors.newFixedThreadPool(4);
		List<Future<String>> result = new ArrayList<>();
		Callable<String> passanger = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "has arived");
			Thread.sleep(2000);
			latch.countDown();
			if (latch.getCount() == 0) {
				System.out.println("all passanger arrived .start car");

			} else {
				latch.await();
			}
			return name + "is ready";

		};
		for (int i = 1; i <= 4; i++) {
			result.add(service.submit(passanger));
		}
		for (Future<String> future : result) {
			System.out.println(future.get());
			latch.getCount();
			service.shutdown();
		}
	}
}
