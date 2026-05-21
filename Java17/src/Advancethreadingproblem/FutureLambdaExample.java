package Advancethreadingproblem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureLambdaExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(1);

		Future<Integer> future = service.submit(() -> {

			Thread.sleep(2000);

			return 100;
		});

		System.out.println("Waiting...");

		System.out.println("Result : " + future.get());

		service.shutdown();
	}
}
