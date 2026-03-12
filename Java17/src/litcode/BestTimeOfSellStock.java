package litcode;
/**
| Day | Price | Min Price | Profit |
| --- | ----- | --------- | ------ |
| 1   | 7     | 7         | 0      |
| 2   | 1     | 1         | 0      |
| 3   | 5     | 1         | 4      |
| 4   | 3     | 1         | 4      |
| 5   | 6     | 1         | 5      |
| 6   | 4     | 1         | 5      |
------------------------------------
 */
public class BestTimeOfSellStock {
	public int maxProfit(int[] prices) {
		int min = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			profit = Math.max(profit, prices[i] - min);
		}
		return profit;

	}

	public static void main(String[] args) {
		BestTimeOfSellStock stock = new BestTimeOfSellStock();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int result = stock.maxProfit(prices);
		System.out.println(result);
	}
}
