package array;

import java.util.Arrays;

public class CustomerBill {
	public static void main(String[] args) {
		// Customer bills in dollars
		int[] bills = { 120, 150, 100, 80, 200, 130 };

		double mean = calculateMean(bills);
		double median = calculateMedian(bills);

		System.out.println("Customer Bills: " + Arrays.toString(bills));
		System.out.println("Average Bill: $" + mean);
		System.out.println("Median Bill: $" + median);
	}

	private static double calculateMean(int[] arr) {
		int sum = 0;
		for (int val : arr)
			sum += val;
		return (double) sum / arr.length;
	}

	private static double calculateMedian(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 == 0)
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		else
			return arr[n / 2];
	}
}
