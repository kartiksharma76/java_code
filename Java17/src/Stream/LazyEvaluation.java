package Stream;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		nums.stream().filter(n -> {
			System.out.println("Filtering: " + n);
			return n % 2 == 0;
		}).limit(2).forEach(System.out::println);
		// Stops after 2 even numbers; lazy evaluation avoids processing rest
	}
}
