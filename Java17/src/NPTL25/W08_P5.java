package NPTL25;

import java.beans.IntrospectionException;

public class W08_P5 {
static class Counter {
	int count = 0;
	public synchronized void increment() {
		count++;
		
	}
}
static class MyThread extends Thread{
	Counter c;
	public MyThread(Counter c) {
		this.c=c;
		
	}
	@Override
	public void run() {
		for(int i= 1;i<=1000;i++) {
			c.increment();
		}
	}
}
public static void main(String[] args) {
	Counter c = new Counter();
	MyThread t1 = new MyThread(c);
	MyThread t2 = new MyThread(c);
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join();
		
		
	} catch (InterruptedException e) {
	}
	System.out.println("Final count is :"+ c.count);
}

}
