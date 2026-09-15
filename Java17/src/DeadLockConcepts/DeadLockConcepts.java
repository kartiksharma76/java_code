package DeadLockConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockConcepts {
	private Object jansatabi = new Object();
	private Object hawda = new Object();

	public void takejansatbadi() {
		synchronized (jansatabi) {
			System.out.println("jansatbadi is locked by:" + Thread.currentThread().getName());
			synchronized (hawda) {
				System.out.println("jansatbadi passing to track 1:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void takehawada() {
		synchronized (jansatabi) {
			System.out.println("hawada is lock:" + Thread.currentThread().getName());
			synchronized (hawda) {
				System.out.println("hawada is passing on track 2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		DeadLockConcepts lock = new DeadLockConcepts();
		Runnable jansatbadi = () -> {
			while (true) {
				lock.takejansatbadi();
			}
		};
		Runnable hawada = () -> {
			while (true) {
				lock.takehawada();
			}
		};
		service.submit(jansatbadi);
		service.submit(hawada);
	}
}
