package multithreadingrealproblem;

class AlternatePrinter {
	private int number = 1;
	private final int LIMIT = 100;

	public synchronized void printOdd() {
		while (number <= LIMIT) {
			while (number % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if (number <= LIMIT) {
				System.out.println(Thread.currentThread().getName() + ":" + number);
				number++;
			}
			notifyAll();
		}
	}

	public synchronized void PrintEven() {
		while (number <= LIMIT) {
			while (number % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if (number <= LIMIT) {
				System.out.println(Thread.currentThread().getName() + ":" + number);
				number++;
			}
			notifyAll();
		}
	}
}

public class AlternateNumbers {
	public static void main(String[] args) {

		AlternatePrinter printer = new AlternatePrinter();

		Thread odd = new Thread(() -> printer.printOdd(), "Thread-Odd");

		Thread even = new Thread(() -> printer.PrintEven(), "Thread-Even");

		odd.start();
		even.start();

		try {
			odd.join();
			even.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Completed...");
	}
}
