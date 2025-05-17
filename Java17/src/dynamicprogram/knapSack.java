package dynamicprogram;

public class knapSack {

	static int knapsackRec(int capacity, int[] profit, int[] weight, int n) {

		if (n == 0 || capacity == 0)
			return 0;

		int pick = 0;

		if (weight[n - 1] <= capacity)
			pick = profit[n - 1] + knapsackRec(capacity - weight[n - 1], profit, weight, n - 1);

		int notPick = knapsackRec(capacity, profit, weight, n - 1);

		return Math.max(pick, notPick);
	}

	static int knapsack(int capacity, int[] profit, int[] weight) {
		int n = profit.length;
		return knapsackRec(capacity, profit, weight, n);
	}

	public static void main(String[] args) {
		int[] profit = { 20, 30, 15, 10 };
		int[] weight = { 5, 2, 4, 3 };
		int capacity = 7;
		System.out.println("maximum profit:" + knapsack(capacity, profit, weight));
	}
}
