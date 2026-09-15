package array;

import java.util.Arrays;

public class MeanMedium {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 8, 4 };
		int mean = calculatemeam(arr);
		int medium = calculatemedian(arr);
		System.out.println(mean + " " + medium);
	}

	private static int calculatemedian(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum / arr.length;
	}

	private static int calculatemeam(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		if (n % 2 == 0) {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2;
		}
		return arr[n / 2];
	}
}