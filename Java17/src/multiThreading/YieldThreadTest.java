package multiThreading;

public class YieldThreadTest {
	public static void main(String[] args) {
		YieldThread yieldThread = new YieldThread();
		Thread thread = new Thread(yieldThread);
		thread.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread");
		}
	}
}
