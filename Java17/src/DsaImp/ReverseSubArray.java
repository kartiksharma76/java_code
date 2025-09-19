package DsaImp;

import java.util.Arrays;

public class ReverseSubArray {
	public static void reverseSubArraySafe(int[] arr, int start, int end) {
		if (arr == null) {
			throw new IllegalArgumentException("Array can not be null");

		}
		if (start < 0 || end >= arr.length || start > end) {
			throw new IllegalArgumentException("Invalid start or end index: start=" + start + ", end=" + end);
		}
		System.out.println("\nReversing subarray from index " + start + " to " + end);
		System.out.println("Initial: " + Arrays.toString(arr));
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			System.out.println("Swapped arr[" + start + "] <->: arr[" + end + "] -> " + Arrays.toString(arr));
			start++;
			end--;
 
		}
		System.out.println(" Final: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original array: " + Arrays.toString(arr));
		reverseSubArraySafe(arr, 1, 4);

	}
}
