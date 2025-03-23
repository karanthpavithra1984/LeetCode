package easy.dp;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maxProfit = 0;

        for(int i=1; i < prices.length; i++){
            int profit = prices[i] - minimumPrice;
            minimumPrice = Math.min(prices[i], minimumPrice);
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
