package array;

import java.util.Arrays;

public class MeanMedian4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 19, 28, 5 };
		int mean = calculatemean(arr);
		int median = calculatemedian(arr);
		System.out.println(mean + " " + median);
	}

	private static int calculatemedian(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum / arr.length;

	}

	private static int calculatemean(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		if (n % 2 == 0) {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2;

		} else {
			return arr[n / 2];
		}

	}
}
