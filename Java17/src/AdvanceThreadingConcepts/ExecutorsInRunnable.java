package AdvanceThreadingConcepts;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsInRunnable {
	public static int sum = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable sumThread = () -> {
			int tempsum = 0;
			for (int i = 1; i <= 100; i++) {
				tempsum += i;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum = +tempsum;
		};
		LocalTime start = LocalTime.now();
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<?> future = service.submit(sumThread);
		future.get();
		service.shutdown();
		LocalTime end = LocalTime.now();
		System.out.println("sum:" + sum);
		Duration duration = Duration.between(start, end);
		System.out.println("Time Taken:" + duration.toMillis()+"ms");
	}
}