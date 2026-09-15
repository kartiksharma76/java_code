package Polymorphism;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "is running" + i);

		}
		try {
			Thread.sleep(500);

		} catch (InterruptedException e) {
			System.out.println("thread intrupted");
		}
	}
}