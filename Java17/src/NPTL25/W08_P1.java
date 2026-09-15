package NPTL25;

public class W08_P1 {
static class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread id running");
	}
}
public static void main(String[] args) {
	MyThread thread = new MyThread();
	thread.start();
}
}
