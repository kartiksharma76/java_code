package AdvanceThreadingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallbleExample {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService service= Executors.newSingleThreadExecutor();
	Callable<Integer> callable=()->{
		Thread.sleep(2000);
		return 42;
		
	};
	Future<Integer> future=service.submit(callable);
	System.out.println("doint other staff.......");
	Integer result=future.get();
	System.out.println("result from callable:"+result);
	service.shutdown();
	
}
}
