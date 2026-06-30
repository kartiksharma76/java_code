package multithreadingrealproblem;

import java.util.concurrent.*;

class LogSystem {

	private final BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();

	// Producer
	public void generateLog(String log) {

		try {

			logQueue.put(log);

			System.out.println(Thread.currentThread().getName() + " generated : " + log);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}

	// Consumer
	public void processLogs() {

		try {

			while (true) {

				String log = logQueue.take();

				System.out.println(Thread.currentThread().getName() + " processing : " + log);

				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}
}

public class LogProcessingDemo {

	public static void main(String[] args) throws Exception {

		LogSystem system = new LogSystem();

		ExecutorService executor = Executors.newFixedThreadPool(5);

		// Consumers
		executor.execute(system::processLogs);
		executor.execute(system::processLogs);

		// Producers
		executor.execute(() -> system.generateLog("Login Success"));

		executor.execute(() -> system.generateLog("Payment Completed"));

		executor.execute(() -> system.generateLog("Email Sent"));

		Thread.sleep(5000);

		executor.shutdownNow();

		executor.awaitTermination(5, TimeUnit.SECONDS);

		System.out.println("\nLog Processing Finished.");
	}
}