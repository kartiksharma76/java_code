package Synchronization;

public class LockLevel1 {
	public synchronized void m1() {
		System.out.println(Thread.currentThread().getName());
		{
			System.out.println("m1()synchronized Block");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("m1() non synchronized Block");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void m8() {
		System.out.println(Thread.currentThread().getName());
		{
			System.out.println("m1 synchronized block");
			synchronized (this) {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("m1 () non synchronized block");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void m4() {
		SynchronizationConcepts sc = new SynchronizationConcepts();
		synchronized (sc) {

		}
	}

	public void m6(SynchronizationConcepts sc) {
		synchronized (sc) {
		}
	}

	public void m3() {
		synchronized (LockLevel.class) {
			System.out.println("m3()synchronized block");
		}
		System.out.println("m3() non synchronized block");
	}

	public static synchronized void m7() {
		System.out.println("m7() non synchronized block");
	}
}