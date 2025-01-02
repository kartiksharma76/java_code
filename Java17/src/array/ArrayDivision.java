package array;

import java.util.Arrays;

public class ArrayDivision {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Divide the array into two halves
		int mid = arr.length / 2;
		int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
		int[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);

		// Print the divided arrays
		System.out.println("First Half: " + Arrays.toString(firstHalf));
		System.out.println("Second Half: " + Arrays.toString(secondHalf));
	}
}
