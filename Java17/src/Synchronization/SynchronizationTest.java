package Synchronization;

public class SynchronizationTest {
	public static void main(String[] args) {
		SynchronizationConcepts sc = new SynchronizationConcepts();
		// SynchroniationConcepts sc2=new SynchroniationConcepts();//If you are creating 2 or more objects
		//then don't think about synchronization impact(multithreading)
		Runnable r1 = () -> {
			sc.m2();
		};
		Runnable r2 = () -> {
			sc.m3();
		};
		Runnable r3 = () -> {
			sc.m1();
		};
		Runnable r4 = () -> {
			SynchronizationConcepts.m4();
		};
		Runnable r5 = () -> {
			SynchronizationConcepts.m5();
		};
		Runnable r6 = () -> {
			SynchronizationConcepts.m6();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
