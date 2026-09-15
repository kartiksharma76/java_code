package Advancethreadingproblem;

import java.util.concurrent.*;

public class ForkJoinPoolLambdaExample {

	public static void main(String[] args) throws Exception {

		ForkJoinPool pool = new ForkJoinPool();

		Future<Integer> future = pool.submit(() -> {

			int sum = 0;

			for (int i = 1; i <= 10; i++) {

				sum += i;
			}

			return sum;
		});

		System.out.println("Sum : " + future.get());

		pool.shutdown();
	}
}
