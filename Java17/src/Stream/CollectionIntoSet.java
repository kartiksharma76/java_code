package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionIntoSet {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 2, 3);
		Set<Integer> set = nums.stream().collect(Collectors.toSet());
		System.out.println(set); // [1,2,3]
	}
}
