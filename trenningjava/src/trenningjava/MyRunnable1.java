package trenningjava;

public class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable running:" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		MyRunnable1 r = new MyRunnable1();
		Thread t = new Thread(r, "MyThread");
		t.start();

		Thread t2 = new Thread(() -> {
			System.out.println("Lambda thread!");
		}, "LambdaThread");
		t2.start();
	}
}
