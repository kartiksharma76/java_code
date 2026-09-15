package multithreadingrealproblem;

class NumberPrinter {
	private int number = 1;
	private final int limit;

	public NumberPrinter(int limit) {
		this.limit = limit;
	}

	public synchronized void printOdd() {
		while (number <= limit) {
			while (number % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if (number <= limit) {
				System.out.println("Odd :" + number);
				number++;
			}
			notify();
		}
	}

	public synchronized void printEven() {
		while (number <= limit) {
			while (number % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}

			if (number <= limit) {
				System.out.println("Even : " + number);
				number++;
			}
			notifyAll();
		}
	}
}

public class EvenOddThread {
	public static void main(String[] args) {
		NumberPrinter printer = new NumberPrinter(10);

		Thread oddThread = new Thread(() -> printer.printOdd());
		Thread evenThread = new Thread(() -> printer.printEven());

		oddThread.start();
		evenThread.start();

		try {
			oddThread.join();
			evenThread.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Printing Completed.");
	}
}
