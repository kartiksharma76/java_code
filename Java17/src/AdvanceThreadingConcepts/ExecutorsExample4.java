package AdvanceThreadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample4 {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(4);
	Runnable oddthread=()->{
		for(int i=1;i<=4;i++) {
			System.out.println("i am odd thread");
		}
	};
	Runnable eventhread=()->{
		for(int i=1;i<=4;i++) {
			System.out.println("i am even thread");
		}
	};
	service.submit(eventhread);
	service.submit(oddthread);
}
}
