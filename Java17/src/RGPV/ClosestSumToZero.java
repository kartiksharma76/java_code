package RGPV;

import java.util.Arrays;

public class ClosestSumToZero {
	public static void findClosestToZero(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array should have at least two elements.");
			return;
		}

		Arrays.sort(arr);

		int left = 0;
		int right = arr.length - 1;
		int minSum = Integer.MAX_VALUE;
		int closestLeft = left;
		int closestRight = right;

		while (left < right) {
			int sum = arr[left] + arr[right];

			// Check if the absolute sum is less than the minimum sum found so far
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				closestLeft = left;
				closestRight = right;
			}

			// Move the pointers based on the sum
			if (sum < 0) {
				left++;
			} else {
				right--;
			}
		}

		// Output the result
		System.out.println(
				"The two elements whose sum is closest to zero are: " + arr[closestLeft] + " and " + arr[closestRight]);
	}

	// Main method to test the function
	public static void main(String[] args) {
		int[] arr = { 1, 60, -10, 70, -80, 85 };
		findClosestToZero(arr);
	}
}
