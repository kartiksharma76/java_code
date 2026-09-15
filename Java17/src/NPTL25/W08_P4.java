package NPTL25;

public class W08_P4 {
static class MyThread extends Thread{
	public void run() {
		
	}
}
public static void main(String[] args) {
	MyThread t = new MyThread();
	t.setPriority(8);
	t.start();
	System.out.println("Thread priority is :"+ t.getPriority());
}
}
