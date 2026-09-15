package AdvanceThreadingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Semaphore semaphore = new Semaphore(4);
		Callable<Integer> callable = () -> {
			semaphore.acquire();//If plate available then aquire else wait for the plate(resource)
			System.out.println(Thread.currentThread().getName() + "started Eating:");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "finished Eating:");
//		if(semaphore.availablePermits()==0&&names.contains(name)) {
//		System.out.println(name+" relesing plate");
//		semaphore.release();
//	}
			return semaphore.availablePermits();

		};
		ExecutorService service = Executors.newFixedThreadPool(10);
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
