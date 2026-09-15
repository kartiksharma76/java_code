package multiThreading;

public class JoinThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			try {
				// Thread.currentThread().join(1000);
				// Thread.sleep(1000);
				System.out.println("I am join thread");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
