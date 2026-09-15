package DsaImp;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class KSizeSubarrayMaximum {
	public static int[] maxOfSubArrays(int[] arr, int n, int k) {
		Deque<Integer> dq = new LinkedList<>();
		int[] result = new int[n - k + 1];
		int index = 0;

		for (int i = 0; i < n; i++) {
			while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
				dq.pollFirst();

			}
			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
				dq.pollLast();

			}
			dq.offerLast(i);

			if (i >= k - 1) {
				result[index++] = arr[dq.peekFirst()];

			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int n = arr.length;

		int[] result = maxOfSubArrays(arr, n, k);

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Window size: " + k);
		System.out.println("Maximums: " + Arrays.toString(result));
		testCases();
	}

	private static void testCases() {
		// TODO Auto-generated method stub
		System.out.println("\n=== Test Cases ===");

		int[] arr1 = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int[] res1 = maxOfSubArrays(arr1, arr1.length, 3);
		System.out.println("Input: " + Arrays.toString(arr1) + ", k=3");
		System.out.println("Output: " + Arrays.toString(res1));
	}
}
