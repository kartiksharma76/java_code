package array;

import java.util.Arrays;

public class MeanMedian1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 19, 28, 5 };
		double mean = calculateMean(arr);
		double Median = calculateMedian(arr);

		System.out.printf("mean:%.1f,Median:%.1f", mean, Median);

	}

	private static double calculateMedian(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArr);
		int middleindex = sortedArr.length / 2;
		if (sortedArr.length % 2 == 0) {
			return (double) 
					(sortedArr[middleindex - 1] + sortedArr[middleindex]) / 2;

		} else {
			return sortedArr[middleindex];
		}

	}

	private static double calculateMean(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;

		}
		return (double) sum / arr.length;

	}
}
