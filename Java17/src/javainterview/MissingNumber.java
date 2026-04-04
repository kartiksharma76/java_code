package javainterview;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int sum = 0;
		int expectedSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		for (int i = 1; i <= 7; i++) {
			expectedSum = expectedSum + i;

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(expectedSum - sum);
	}
}
