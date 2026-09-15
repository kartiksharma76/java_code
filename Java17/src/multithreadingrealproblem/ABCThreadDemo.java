package multithreadingrealproblem;

class ABCPrinter {

	private int turn = 1;
	private final int LIMIT = 5;

	public synchronized void printA() {

		for (int i = 1; i <= LIMIT; i++) {

			while (turn != 1) {

				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}

			System.out.print("A");

			turn = 2;

			notifyAll();
		}
	}

	public synchronized void printB() {

		for (int i = 1; i <= LIMIT; i++) {

			while (turn != 2) {

				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}

			System.out.print("B");

			turn = 3;

			notifyAll();
		}
	}

	public synchronized void printC() {

		for (int i = 1; i <= LIMIT; i++) {

			while (turn != 3) {

				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}

			System.out.print("C");

			turn = 1;

			notifyAll();
		}
	}
}

public class ABCThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		ABCPrinter printer = new ABCPrinter();

		Thread t1 = new Thread(printer::printA);

		Thread t2 = new Thread(printer::printB);

		Thread t3 = new Thread(printer::printC);

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("\nCompleted.");
	}
}