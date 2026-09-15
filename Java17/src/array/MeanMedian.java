package array;

import java.util.Arrays;

public class MeanMedian {
	public static void main(String[] args) {
		int[] arr = { 2, 8, 3, 4 };
		int mean = calculateMean(arr);
		int median = calculateMedian(arr);
		System.out.println(mean + " " + median);

	}

	private static int calculateMedian(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum / arr.length;

	}

	private static int calculateMean(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		if (n % 2 == 0) {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2;
		} else {
			return arr[n / 2];
		}

	}
}
