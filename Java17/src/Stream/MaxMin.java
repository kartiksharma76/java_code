package Stream;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 5, 20, 15);
		int max = nums.stream().max(Integer::compare).get();
		int min = nums.stream().min(Integer::compare).get();
		System.out.println("Max:" + max + ",Min: " + min);
	}
}
