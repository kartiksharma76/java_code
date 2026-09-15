package multiThreading;

public class OddThread1 implements Runnable {

	@Override
	public void run() {
	for(int i=0;i<=10;i++) {
		if(i%2!=0) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
		
	}

}
