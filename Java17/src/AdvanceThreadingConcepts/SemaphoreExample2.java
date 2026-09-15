package AdvanceThreadingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class SemaphoreExample2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		while (true) {
			Semaphore semaphore = new Semaphore(4);
			ExecutorService service = Executors.newFixedThreadPool(10);
			Callable<Integer> callable = () -> {
				semaphore.acquire();// If plate available then aquire else wait for the plate(resource)
				System.out.println(Thread.currentThread().getName() + "started Eating:");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "finished Eating:");
				return semaphore.availablePermits();

			};

			for (int i = 1; i <= 10; i++) {
				Future<Integer> submit = service.submit(callable);
				System.out.println(Thread.currentThread().getName() + "tells available plate: " + submit.get());
				if (semaphore.availablePermits() == 0) {
					semaphore.release(4);
				}

			}
			service.shutdown();

		}
	}
}