package array;

import java.util.Arrays;

public class MeanMedian3 {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 4, 8, 10, 20, 50 };
		double mean = calculateMean(arr);
		double median = calculateMedian(arr);

		System.out.println("mean:" + mean);
		System.out.println("median:" + median);
	}

	private static double calculateMedian(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;

		}
		return (double) sum / arr.length;
	}

	private static double calculateMean(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 == 0) {
			int mid1 = arr[n / 2 - 1];
			int mid2 = arr[n / 2];

			return (double) (mid1 + mid2) / 2;

		} else {
			return arr[n / 2];
		}
	}
}