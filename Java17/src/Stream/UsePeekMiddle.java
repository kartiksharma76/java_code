package Stream;

import java.util.Arrays;
import java.util.List;

public class UsePeekMiddle {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		int sum = nums.stream().peek(n -> System.out.println("Processing: " + n)).filter(n -> n % 2 == 0)
				.mapToInt(Integer::intValue).sum();
		System.out.println("Sum: " + sum); // 6
	}
}
