package multiThreading;

import StreamAPI.ThreadHelper;

public class EvenThread extends Thread{
	public void run() {
//		for(int i=0;i<=10;i++) {
//			if(i%2==0) {
//				System.out.println(Thread.currentThread().getName()+" "+i);
//			}
//		}
//System.out.println(Thread.currentThread().getName());
	ThreadHelper.sortStudent();	
	}

}
