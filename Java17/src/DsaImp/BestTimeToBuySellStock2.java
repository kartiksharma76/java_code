package DsaImp;

/**
 * In this problem, there is an array whose share price has been given which we
 * can buy once And after that we can sell it, calculate the maximum profit such
 * that if there is no profit then Return 0 Let us assume that Adani Green is
 * tracking shares whose price is : [ 7,1,5,3,6,4] Day 1. If you buy at $7, it
 * will be expensive Day 2. Buy the cheapest at $1 Day 3. $6 ->sellhere ->
 * profit = 6-1 =$5 best deal : buy at $6 ->max profit =$5
 *
 * Think about the daily price : If I sell today then when did I buy the
 * cheapest profit = today's price = lowest price till now that's why
 *
 * Minimize the stock so far Every day, calculate the price Update the maximum
 * profit
 */
public class BestTimeToBuySellStock2 { 
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			} else if (price - minPrice > maxProfit) {
				maxProfit = price - minPrice;
			}

		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("max Profit $" + maxProfit(prices));
	}
}
