package DeadLockConcepts;

import java.util.ResourceBundle;

public class DeadLockExample {
	public void methodA() {
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName() + "lock string.class");
			synchronized (Integer.class) {
				System.out.println(Thread.currentThread().getName() + "lock integer.class");

			}

		}
	}

	public void methodB() {
		synchronized (Integer.class) {
			System.out.println(Thread.currentThread().getName() + "lock integer class");
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName() + "lock string class");

			}

		}
	}

	public static void main(String[] args) {
		DeadLockExample dls = new DeadLockExample();
		Thread t1 = new Thread(() -> dls.methodA(), "thread -1");
		Thread t2 = new Thread(() -> dls.methodB(), "thread -1");
		t1.start();
		t2.start();
	}
}
