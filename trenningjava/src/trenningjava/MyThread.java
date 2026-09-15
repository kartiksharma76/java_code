package trenningjava;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Thread :" + getName() + "running");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("Thread-1");
		t1.start();
	}
}
