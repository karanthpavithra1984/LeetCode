package medium.dp;

public class BestTimeToBurOrSellStockII {
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            int tempBuy = buy;
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, tempBuy + prices[i]);
        }

        return sell;
    }
}
