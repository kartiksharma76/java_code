package litcode;

public class OddEvenThread {
	private static final Object lock = new Object();
	private static int num = 1, limit = 10;

	public static void main(String[] args) {
		Thread odd = new Thread(() -> {
			synchronized (lock) {
				while (num <= limit) {
					if (num % 2 == 1) {
						System.out.println("Odd " + num++);
						lock.notify();

					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {

						}
					}
				}
			}
		});
		Thread even = new Thread(() -> {
			synchronized (lock) {
				while (num <= limit) {
					if (num % 2 == 0) {
						System.out.println("Even: " + num++);
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
				}
			}
		});
		odd.start();
		even.start();

	}
}
