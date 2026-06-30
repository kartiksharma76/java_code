package multithreadingrealproblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DownloadTask implements Runnable {

	private final String fileName;

	public DownloadTask(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started downloading " + fileName);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println(Thread.currentThread().getName() + " finished downloading " + fileName);
	}

}

public class DownloadManager {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.execute(new DownloadTask("File-1.pdf"));
		executor.execute(new DownloadTask("File-2.pdf"));
		executor.execute(new DownloadTask("File-3.pdf"));
		executor.execute(new DownloadTask("File-4.pdf"));
		executor.execute(new DownloadTask("File-5.pdf"));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		System.out.println("\nAll Downloads Completed.");

	}
}
