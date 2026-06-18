package trenningjava;

public class MyRunnable implements Runnable {
	private int data;

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();

		for (int c = 1; c <= 50; c++) {
			System.out.println(name + ": " + ++data);
		}

	}

	public static void main(String[] args) {
		Runnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);

		Thread t2 = new Thread(mr, "Second");
		Thread t3 = new Thread(mr, "Third");
		t1.start();
		t2.start();
		t3.start();
	}

}
