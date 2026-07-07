package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 2, 2, 1, 1 };
		int candidate1 = 0, candidate2 = 0;
		int count1 = 0, count2 = 0;

		for (int num : arr) {

			if (num == candidate1) {
				count1++;
			} else if (num == candidate2) {
				count2++;
			} else if (count1 == 0) {
				candidate1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		// Verify candidates
		count1 = 0;
		count2 = 0;

		for (int num : arr) {
			if (num == candidate1) {
				count1++;
			} else if (num == candidate2) {
				count2++;
			}
		}

		List<Integer> result = new ArrayList<>();

		if (count1 > arr.length / 3) {
			result.add(candidate1);
		}

		if (count2 > arr.length / 3) {
			result.add(candidate2);
		}

		System.out.println("Majority Elements: " + result);
	}
}
