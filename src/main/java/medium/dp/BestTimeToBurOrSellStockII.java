package medium.dp;

public class BestTimeToBurOrSellStockII {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for(int i=1; i < prices.length; i++){
            if(prices[i] > minPrice){
                profit += prices[i] - minPrice;
                minPrice = prices[i];
            }else {

                minPrice = Math.min(minPrice, prices[i]);
            }
        }

        return profit;
    }
}
