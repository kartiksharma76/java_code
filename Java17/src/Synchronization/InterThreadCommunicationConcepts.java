package Synchronization;

public class InterThreadCommunicationConcepts {
	public synchronized void m1() {//Apply lock using synchronized keyword on current object
//		Object obj=new Object();
		try {
		//	this.wait();//Release current object lock(If lock is not applied then it will throw 
			//an IllegalMonitorStateException)
		//	this.notify(); //Release current object lock and notify a waiting Thread
			this.notifyAll();//Release current object lock and notify all waiting Threads
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	Runnable runnable=()->{
		m1();
		
	};
	public static void main(String[] args) {
		InterThreadCommunicationConcepts itc=new InterThreadCommunicationConcepts();
//		itc.m1();
		Thread t1=new Thread(itc.runnable);
		t1.start();
	}
}
