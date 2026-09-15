package ArrayQuestion;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 2 };

		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;

		}
		System.out.println("after removed:");
		System.out.println(Arrays.toString(result));
	}
}
