package array2026;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
	}

	public static int[] reverseCopy(int[] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// In-place reverse
		reverse(arr);
		System.out.println("In-place reversed: " + Arrays.toString(arr));

		// Reverse copy
		int[] newArr = reverseCopy(arr);
		System.out.println("Reverse copy: " + Arrays.toString(newArr));
	}
}
