package array;

import java.util.Arrays;

public class TrafficTravelTime {

	public static void main(String[] args) {
		// Travel time in minutes for different routes
		int[] travelTimes = { 35, 40, 50, 30, 45, 60 };

		double mean = calculateMean(travelTimes);
		double median = calculateMedian(travelTimes);

		System.out.println("Travel Times: " + Arrays.toString(travelTimes));
		System.out.println("Average Travel Time: " + mean + " minutes");
		System.out.println("Median Travel Time: " + median + " minutes");
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
