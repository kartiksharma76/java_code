package AdvanceThreadingConcepts;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorsUsingCallable {
	public static void main(String[] args) {
		Callable<Integer> sumThread = () -> {
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
				Thread.sleep(10);
			}
			return sum;

		};
		LocalTime start = LocalTime.now();
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<Integer> result = service.submit(sumThread);
		int sum = 0;
		try {
			sum = result.get(3, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
		LocalTime end = LocalTime.now();
		System.out.println("sum:" + sum);
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis() + "ms");
		service.shutdown();
	}
}
