package NPTL25;

public class W08_P2 {
static class MyRunnable implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Thread id Running");
	}
}
public static void main(String[] args) {
	MyRunnable r = new MyRunnable();
Thread t =new Thread(r);
t.start();
}
}
