package AdvanceThreadingConcepts;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorsExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> sumthread = () -> {
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			Thread.sleep(2000);
			return sum;
		};
		LocalTime start = LocalTime.now();
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<Integer> result = service.submit(sumthread);
		int sum = 0;
		try {
			sum = result.get(3, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			System.out.println(e);
		}
		System.out.println(sum);

		LocalTime end = LocalTime.now();
		System.out.println((end.getNano() - start.getNano()) / 1000);
	}
}
