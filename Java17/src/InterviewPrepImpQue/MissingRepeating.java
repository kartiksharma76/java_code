package InterviewPrepImpQue;

import java.util.Arrays;

public class MissingRepeating {
	public static int[] findTwoElement(int[] arr) {
		int n = arr.length;
		int repeating = -1;
		int missing = -1;

		for (int i = 0; i < n; i++) {
			int index = Math.abs(arr[i]) - 1;

			if (arr[index] < 0) {
				repeating = Math.abs(arr[i]);
			} else {
				arr[index] = -arr[index];
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				missing = i + 1;
				break;
			}
		}
		return new int[] { repeating, missing };

	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 2 };
		int[] res1 = findTwoElement(arr1);
		System.out.println(Arrays.toString(res1)); // [2, 1]

		int[] arr2 = { 1, 3, 3 };
		int[] res2 = findTwoElement(arr2);
		System.out.println(Arrays.toString(res2)); // [3, 2]
	}
}
