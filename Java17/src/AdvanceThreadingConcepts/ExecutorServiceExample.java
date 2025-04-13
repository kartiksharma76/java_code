package AdvanceThreadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(4);
	Runnable oddThread=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("I am oddThread ");
		}
	};
	Runnable evenThread=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("I am EvenThread ");
		}
	};
	service.submit(evenThread);
	service.submit(oddThread);
}
}
