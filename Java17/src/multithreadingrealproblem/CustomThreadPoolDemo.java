package multithreadingrealproblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class CustomThreadPool {

	private final BlockingQueue<Runnable> queue;

	public CustomThreadPool(int numberOfThreads) {

		queue = new LinkedBlockingQueue<>();

		for (int i = 1; i <= numberOfThreads; i++) {

			Thread worker = new WorkerThread();

			worker.setName("Worker-" + i);

			worker.start();
		}
	}

	public void submit(Runnable task) {

		try {

			queue.put(task);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}

	class WorkerThread extends Thread {

		@Override
		public void run() {

			while (true) {

				try {

					Runnable task = queue.take();

					task.run();

				} catch (InterruptedException e) {

					break;
				}
			}
		}
	}
}

public class CustomThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {

		CustomThreadPool pool = new CustomThreadPool(3);

		for (int i = 1; i <= 10; i++) {

			int taskId = i;

			pool.submit(() -> {

				System.out.println(Thread.currentThread().getName() + " executing Task " + taskId);

				try {

					Thread.sleep(2000);

				} catch (InterruptedException e) {

					Thread.currentThread().interrupt();
				}

				System.out.println(Thread.currentThread().getName() + " completed Task " + taskId);
			});
		}

		Thread.sleep(10000);

		System.out.println("\nMain Thread Finished.");
	}
}