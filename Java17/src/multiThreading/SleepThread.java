package multiThreading;

public class SleepThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("I am sleep thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
