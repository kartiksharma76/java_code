package Google.com;

import java.util.Arrays;

public class SmallestSubarrayWithGivenSumIsGreater {
	public static int[] smallestSubArrayWithSum(int[] arr, int x) {

		int n = arr.length;
		int start = 0;
		int sum = 0;
		int minlen = Integer.MAX_VALUE;
		int minStart = 0;
		int minEnd = -1;

		for (int end = 0; end < n; end++) {
			sum += arr[end];

			while (sum > x) {
				if (end - start + 1 < minlen) {
					minlen = end - start + 1;
					minStart = start;
					minEnd = end;
				}
				sum -= arr[start];
				start++;

			}

		}
		if (minEnd == -1) {
			return new int[0];
		}
		return Arrays.copyOfRange(arr, minStart, minEnd + 1);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 19 };
		int x = 51;
		int[] result = smallestSubArrayWithSum(arr, x);
		if (result.length == 0) {
			System.out.println("No SumArray Found");
		} else {
			System.out.println(Arrays.toString(result));

		}
	}
}
