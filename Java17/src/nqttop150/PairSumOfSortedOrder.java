package nqttop150;

import java.util.ArrayList;
import java.util.List;

public class PairSumOfSortedOrder {
	public static List<Integer> elementlessThanTarget(int[] num, int target) {
		List<Integer> result = new ArrayList<>();
		for (int nums : num) {
			if (nums < target) {
				result.add(nums);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 10, 11, 12, 13, 14 };
		int target = 12;
		List<Integer> output = elementlessThanTarget(arr, target);
		System.out.println("final result:" + output);
	}
}
