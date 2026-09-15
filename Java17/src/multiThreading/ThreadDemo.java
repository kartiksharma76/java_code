package multiThreading;

public class ThreadDemo {
public static void main(String[] args) {
	EvenThread eventhread=new EvenThread();
	eventhread.setName("EvenThread");
	OddThread oddthread=new OddThread();
	oddthread.setName("OddThread");
	eventhread.start();
	oddthread.start();
	
}
}
