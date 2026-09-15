package trenningjava;

import java.util.concurrent.*;
import java.util.concurrent.*;

public class MyCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<Integer> future = executor.submit(() -> 42);

		System.out.println("Result: " + future.get());

		executor.shutdown();
	}
}


//class MyCallable implements Callable<Integer> {
//	@Override
//	public Integer call() throws Exception {
//		return 42; // value return kar sakta hai!
//	}
//
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		Future<Integer> future = executor.submit(new MyCallable());
//		int result = future.get(); // blocking call — result ka wait karega
//		System.out.println("Result: " + result);
//		executor.shutdown();
//
//	}
//}
