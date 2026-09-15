package dpp;

public class BestTimeToBuySellStockCooldown {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int hold = -prices[0], sold = 0, rest = 0;
        for (int i = 1; i < n; i++) {
            int prevSold = sold;
            sold = hold + prices[i];
            hold = Math.max(hold, rest - prices[i]);
            rest = Math.max(rest, prevSold);
        }
        return Math.max(sold, rest);
    }
}
