package DsaImp;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumOfMaxOfSubarrays {
	public static long sumOfMaxOfSubarrays(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int n = arr.length;
		long sum = 0;

		// Arrays to store previous greater and next greater elements
		int[] left = new int[n]; // index of previous greater or equal element
		int[] right = new int[n]; // index of next greater element

		// Use stacks to find boundaries
		Deque<Integer> stack = new ArrayDeque<>();

		// Find previous greater or equal element for each i
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}
			left[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
		}

		// Clear stack for next calculation
		stack.clear();

		// Find next greater element for each i
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			right[i] = stack.isEmpty() ? n : stack.peek();
			stack.push(i);
		}

		// Calculate contribution of each element
		for (int i = 0; i < n; i++) {
			// Number of subarrays where arr[i] is maximum
			long count = (long) (i - left[i]) * (right[i] - i);
			sum += arr[i] * count;
		}

		return sum;
	}

	// Brute force solution for verification (O(n³))
	public static long sumOfMaxOfSubarraysBruteForce(int[] arr) {
		long sum = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int max = arr[i];
				for (int k = i + 1; k <= j; k++) {
					max = Math.max(max, arr[k]);
				}
				sum += max;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 1, 2, 4 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 5, 2, 6, 1 };

		System.out.println("Array: [3, 1, 2, 4]");
		System.out.println("Sum of max of subarrays: " + sumOfMaxOfSubarrays(arr1));
		System.out.println("Brute force verification: " + sumOfMaxOfSubarraysBruteForce(arr1));

		System.out.println("\nArray: [1, 2, 3]");
		System.out.println("Sum of max of subarrays: " + sumOfMaxOfSubarrays(arr2));
		System.out.println("Brute force verification: " + sumOfMaxOfSubarraysBruteForce(arr2));

		System.out.println("\nArray: [5, 2, 6, 1]");
		System.out.println("Sum of max of subarrays: " + sumOfMaxOfSubarrays(arr3));
		System.out.println("Brute force verification: " + sumOfMaxOfSubarraysBruteForce(arr3));
	}
}
