package nqttop150;

public class BestTimeToBuySellStock {
	public static int maxprofit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int minprice = prices[0];
		int maxprofit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];
			} else {
				int profit = prices[i] - minprice;
				if (profit > maxprofit) {
					maxprofit = profit;
				}
			}
		}
		return maxprofit;
	}

	public static void main(String[] args) {
		int[] prices = { 10, 8, 7, 5, 2 };
		int result = maxprofit(prices);
		System.out.println("maxprofit:" + result);
	}
}
