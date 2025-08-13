package array;

import java.util.Arrays;

public class ArrayDivision2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int mid = arr.length / 2;
		int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
		int[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);
		System.out.println("FirstHalf:" + Arrays.toString(firstHalf));
		System.out.println("SecondHalf:" + Arrays.toString(secondHalf));

	}
}
