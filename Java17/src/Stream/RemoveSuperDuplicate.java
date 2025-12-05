package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSuperDuplicate {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 2, 2, 4, 3, 4, 6);
		List<Integer> result = nums.stream().distinct().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(result);
	}
}
