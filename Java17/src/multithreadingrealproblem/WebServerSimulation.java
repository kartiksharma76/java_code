package multithreadingrealproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class RequestTask implements Callable<String> {

	private final int requestId;

	public RequestTask(int requestId) {
		this.requestId = requestId;
	}

	@Override
	public String call() throws Exception {

		System.out.println(Thread.currentThread().getName() + " processing Request-" + requestId);

		Thread.sleep(2000);

		System.out.println(Thread.currentThread().getName() + " completed Request-" + requestId);

		return "Response for Request-" + requestId;
	}
}

public class WebServerSimulation {

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		List<Future<String>> futures = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			futures.add(executor.submit(new RequestTask(i)));
		}

		for (Future<String> future : futures) {

			System.out.println(future.get());
		}

		executor.shutdown();
	}
}