package DsaImp;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class LongestBundedDifferenceSubArray {

	public static int longestSubarray(int[] prices, int limit) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		Deque<Integer> maxDeque = new LinkedList<>();
		Deque<Integer> minDeque = new LinkedList<>();

		int left = 0;
		int maxLength = 0;

		for (int right = 0; right < prices.length; right++) {
			while (!maxDeque.isEmpty() && prices[maxDeque.peekLast()] <= prices[right]) {
				maxDeque.pollLast();
			}
			maxDeque.offerLast(right);

			while (!minDeque.isEmpty() && prices[minDeque.peekLast()] >= prices[right]) {
				minDeque.pollLast();
			}
			minDeque.offerLast(right);

			while (prices[maxDeque.peekFirst()] - prices[minDeque.peekFirst()] > limit) {
				left++;

				if (maxDeque.peekFirst() < left) {
					maxDeque.pollFirst();
				}
				if (minDeque.peekFirst() < left) {
					minDeque.pollFirst();
				}
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] socketPrices = { 4, 8, 5, 1, 7, 9, 6, 3 };
		int volatilityLimit = 4;

		int longestStablePeriod = longestSubarray(socketPrices, volatilityLimit);
		System.out.println("Stock Prices: " + Arrays.toString(socketPrices));
		System.out.println("Volatility Limit: $" + volatilityLimit);
		System.out.println("Longest stable period: " + longestStablePeriod + " consecutive days");

		DemonstrateOtherUseCases();
	}

	private static void DemonstrateOtherUseCases() {
		System.out.println("\n=== Other real-life Applications ===");
		int[] temperatures = { 72, 75, 73, 78, 80, 76, 74, 77 };
		int tempTolerance = 6;
		System.out.println("Temperature monitoring: " + longestSubarray(temperatures, tempTolerance) + " hours within "
				+ tempTolerance + "°F tolerance");

		int[] latencies = { 120, 150, 130, 200, 180, 140, 160, 170 };
		int latencyLimit = 40;
		System.out.println("Network stability: " + longestSubarray(latencies, latencyLimit) + " measurements within "
				+ latencyLimit + "ms variation");
	}
}