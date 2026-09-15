package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstThree {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> result = nums.stream().skip(3).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
