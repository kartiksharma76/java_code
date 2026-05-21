package Advancethreadingproblem;

import java.util.concurrent.Callable;

public class CallableLambdaExample {
	public static void main(String[] args) throws Exception {
		Callable<Integer> task = () -> {
			int sum = 0;

			for (int i = 1; i <= 5; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(task.call());
	}
}
