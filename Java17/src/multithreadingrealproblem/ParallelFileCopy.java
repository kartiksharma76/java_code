package multithreadingrealproblem;

import java.nio.file.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class FileCopyTask implements Runnable {

	private final Path source;
	private final Path destination;

	public FileCopyTask(Path source, Path destination) {
		this.source = source;
		this.destination = destination;
	}

	@Override
	public void run() {

		try {

			Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

			System.out.println(Thread.currentThread().getName() + " copied " + source.getFileName());

		} catch (Exception e) {

			System.out.println("Failed : " + source.getFileName());

			e.printStackTrace();
		}
	}
}

public class ParallelFileCopy {

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		String[] files = {

				"report.pdf", "image.png", "notes.txt", "resume.docx", "data.csv" };

		for (String file : files) {

			Path source = Paths.get("source", file);

			Path destination = Paths.get("backup", file);

			executor.execute(new FileCopyTask(source, destination));
		}

		executor.shutdown();

		executor.awaitTermination(5, TimeUnit.MINUTES);

		System.out.println("\nBackup Completed.");
	}
}