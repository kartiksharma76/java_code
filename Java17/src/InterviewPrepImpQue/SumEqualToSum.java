package InterviewPrepImpQue;

import java.util.HashSet;

public class SumEqualToSum {
	public static boolean hasEqualSumParis(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 2; j < n; j++) {
				int sum = arr[i] + arr[j];

				if (set.contains(sum)) {
					return true;
				}
				set.add(sum);

			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 7, 1, 2, 9, 8 };
		System.out.println(hasEqualSumParis(arr1)); // true

		int[] arr2 = { 65, 30, 7, 90, 1, 9, 8 };
		System.out.println(hasEqualSumParis(arr2));// false
	}
}
