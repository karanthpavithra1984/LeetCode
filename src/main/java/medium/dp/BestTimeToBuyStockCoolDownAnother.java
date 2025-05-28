package medium.dp;

public class BestTimeToBuyStockCoolDownAnother {
    public int maxProfit(int[] prices) {
       int buy = prices[0], sell =0, cooldown = 0;

       for(int i=1; i < prices.length; i++){
           int profit = prices[i] - buy;
           buy = Math.min(buy, prices[i] - cooldown);
           cooldown = Math.max(cooldown, sell);
           sell = profit;
       }

       return Math.max(cooldown, sell);
    }
}
