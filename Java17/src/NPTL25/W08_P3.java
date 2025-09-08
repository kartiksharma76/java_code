package NPTL25;

public class W08_P3 {
static class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is Running");
	}
}
public static void main(String[] args) {
	MyThread t = new MyThread();
	System.out.println("thread state before start");
	t.start();
	System.out.println("Thread state after start");
	try {
		t.join();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(" Thread state after completion");
}
}
