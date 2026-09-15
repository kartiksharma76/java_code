package array;

import java.util.Arrays;

public class WeatherTemperature {
	public static void main(String[] args) {
		int[] temperature = { 25, 28, 22, 30, 27, 26, 24 };

		double mean = calculateMean(temperature);
		double median = calculateMedian(temperature);

		System.out.println("Daily Temperatures: " + Arrays.toString(temperature));
		System.out.println("Average Temperature: " + mean + "°C");
		System.out.println("Median Temperature: " + median + "°C");
	}

	private static double calculateMedian(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 == 0)
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		else

			return arr[n / 2];
	}

	private static double calculateMean(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int val : arr)
			sum += val;
		return (double) sum / arr.length;
	}
}
