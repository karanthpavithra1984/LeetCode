package medium.dp;

public class BestTimeToBurOrSellStockIIAnother {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice;
            if (currentProfit >= 0) {
                minPrice = prices[i];
                profit += currentProfit;
            } else {
                minPrice = Math.min(minPrice, prices[i]);
            }
        }

        return profit;
    }
}
