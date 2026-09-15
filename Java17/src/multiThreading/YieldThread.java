package multiThreading;

public class YieldThread extends Thread{
@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			Thread.yield();
			System.out.println("I am yield thread");
		}
		
		
	}
}
