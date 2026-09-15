package Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceProduct {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		int prod = nums.stream().reduce(1, (a, b) -> a * b);
		System.out.println(prod); // 24
	}
}
