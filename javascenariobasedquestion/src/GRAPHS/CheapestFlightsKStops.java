package GRAPHS;

import java.util.Arrays;

public class CheapestFlightsKStops {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		int[] prices = new int[n];
		Arrays.fill(prices, Integer.MAX_VALUE);
		prices[src] = 0;
		for (int i = 0; i <= k; i++) {
			int[] tmp = Arrays.copyOf(prices, n);
			for (int[] f : flights)
				if (prices[f[0]] != Integer.MAX_VALUE && prices[f[0]] + f[2] < tmp[f[1]])
					tmp[f[1]] = prices[f[0]] + f[2];
			prices = tmp;
		}
		return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
	}

	public static void main(String[] args) {
		CheapestFlightsKStops sol = new CheapestFlightsKStops();
		int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
		System.out.println(sol.findCheapestPrice(3, flights, 0, 2, 1)); // 200
	}
}