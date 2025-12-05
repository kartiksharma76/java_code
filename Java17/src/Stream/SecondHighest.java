package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 30, 40);
		int SecondMax = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(SecondMax);
	}
}
