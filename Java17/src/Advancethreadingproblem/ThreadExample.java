package Advancethreadingproblem;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Running : " + i);
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();

	}
}
