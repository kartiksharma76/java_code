package Google.com;

import java.util.Arrays;

public class SubarrayWithGivenSum {
	public static int[] findSubarray(int[] arr, int target) {
		int start = 0, sum = 0;

		for (int end = 0; end < arr.length; end++) {
			sum += arr[end];
			while (sum > target && start <= end) {
				sum -= arr[start];
				start++;
			}
			if (sum == target) {
				return Arrays.copyOfRange(arr, start, end + 1);
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int target = 33;

		int[] result = findSubarray(arr, target);
		if (result.length == 0) {
			System.out.println("No subarray found");
		} else {
			System.out.println("Subarray with sum " + target + ": " + Arrays.toString(result));
		}
	}
}
