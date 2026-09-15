package DeadLockConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IntersectionExample {
	private Object roadA = new Object();
	private Object roadB = new Object();

	public void takeCarA() {
		synchronized (roadA) {
			System.out.println("car A is locked by" + Thread.currentThread().getName());
			synchronized (roadB) {
				System.out.println("car is passing through road A");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public void takeCarB() {
		synchronized (roadA) {
			System.out.println("car B is locked by" + Thread.currentThread().getName());
			synchronized (roadB) {
				System.out.println("car is passing through road B");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		InterSection intersection = new InterSection();

		Runnable roadA = () -> {
			while (true) {
				intersection.takeRoadA();
			}
		};
		Runnable roadB = () -> {
			while (true) {
				intersection.takeRoadB();
			}
		};
		service.submit(roadA);
		service.submit(roadB);

	}
}
