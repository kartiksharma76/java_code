package multiThreading;

public class SleepThreadTest {
public static void main(String[] args) {
SleepThread sleepThread=new SleepThread();
	
	sleepThread.start();
	for(int i=1;i<=5;i++) {
		
		System.out.println("I am main thread");
	}
}
}
