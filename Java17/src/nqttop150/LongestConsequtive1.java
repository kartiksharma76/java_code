package nqttop150;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequtive1 {
	public static int longconsequtive(int[] arr) {
		Set<Integer> numset = new HashSet<>();

		for (int num : arr) {
			numset.add(num);
		}
		int longest = 0;

		for (int num : numset) {
			if (!numset.contains(num - 1)) {
				int currentnum = num;
				int current = 1;

				while (numset.contains(currentnum + 1)) {
					currentnum++;
					current++;
				}
				longest = Math.max(longest, current);
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 3, 2, 5, 4, 6, 1, 1 };
		int result = longconsequtive(nums);
		System.out.println("longest consequtive sequence:" + result);
	}
}
