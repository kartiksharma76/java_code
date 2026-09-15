package multiThreading;
//Q1) how many ways you can create thread 
//approach 1.
//ans)step1:by extending Thread class
//    step2:override run method and write your business logic
//Q2) how can you start a thread
//ans)step1: create an  object of your thread(thread example)
//    step2: call start method

//approach 2.
// by implementing Runnable interface
// step2: overRide run method

public class ThreadExample extends Thread{
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("child Thread");
	
	}
}
}
