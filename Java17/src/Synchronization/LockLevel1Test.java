package Synchronization;

public class LockLevel1Test {

	public static void main(String[] args) {
		LockLevel1 lock = new LockLevel1();
		Runnable r1 = () -> {
			lock.m8();
		};
		Runnable r2 = () -> {
			lock.m8();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
