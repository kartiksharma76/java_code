package Advancethreadingproblem;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureLambdaExample {
	public static void main(String[] args) throws InterruptedException {

		CompletableFuture.supplyAsync(() -> "Hello").thenApply(result -> result + "Java")
				.thenAccept(System.out::println);
		Thread.sleep(100);
	}
}
