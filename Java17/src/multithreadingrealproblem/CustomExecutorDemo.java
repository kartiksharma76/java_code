package multithreadingrealproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class MyExecutorService {

	private final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();

	private final List<Worker> workers = new ArrayList<>();

	private volatile boolean isShutdown = false;

	public MyExecutorService(int poolSize) {

		for (int i = 1; i <= poolSize; i++) {

			Worker worker = new Worker();

			worker.setName("Worker-" + i);

			workers.add(worker);

			worker.start();
		}
	}

	public void submit(Runnable task) {

		if (isShutdown) {

			throw new IllegalStateException("Executor is already shutdown.");
		}

		try {

			taskQueue.put(task);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}

	public void shutdown() {

		isShutdown = true;

		for (Worker worker : workers) {

			worker.interrupt();
		}

		System.out.println("\nExecutor Shutdown.");
	}

	class Worker extends Thread {

		@Override
		public void run() {

			while (!isShutdown || !taskQueue.isEmpty()) {

				try {

					Runnable task = taskQueue.take();

					task.run();

				} catch (InterruptedException e) {

					if (isShutdown) {
						break;
					}
				}
			}
		}
	}
}

public class CustomExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		MyExecutorService executor = new MyExecutorService(3);

		for (int i = 1; i <= 8; i++) {

			int taskId = i;

			executor.submit(() -> {

				System.out.println(Thread.currentThread().getName() + " executing Task " + taskId);

				try {

					Thread.sleep(2000);

				} catch (InterruptedException e) {

					Thread.currentThread().interrupt();
				}

				System.out.println(Thread.currentThread().getName() + " finished Task " + taskId);
			});
		}

		Thread.sleep(10000);

		executor.shutdown();
	}
}