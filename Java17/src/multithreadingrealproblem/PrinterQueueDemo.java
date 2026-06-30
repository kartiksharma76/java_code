package multithreadingrealproblem;

import java.util.LinkedList;
import java.util.Queue;

class Printer {
	private final Queue<String> queue = new LinkedList<>();

	public synchronized void submitJob(String document) {
		queue.add(document);

		System.out.println(Thread.currentThread().getName() + " submitted " + document);

		notifyAll();
	}

	public synchronized void printJob() {
		while (queue.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		String document = queue.poll();

		System.out.println("Printer is printing " + document);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}
}

public class PrinterQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();

		Thread employee1 = new Thread(() -> printer.submitJob("Document-1"), "Employee-1");

		Thread employee2 = new Thread(() -> printer.submitJob("Document-2"), "Employee-2");

		Thread employee3 = new Thread(() -> printer.submitJob("Document-3"), "Employee-3");

		Thread printerThread = new Thread(() -> {

			for (int i = 1; i <= 3; i++) {
				printer.printJob();
			}

		}, "Printer");

		employee1.start();
		employee2.start();
		employee3.start();

		printerThread.start();

		employee1.join();
		employee2.join();
		employee3.join();
		printerThread.join();

		System.out.println("\nPrinting Completed.");
	}
}
