package medium.dp;

public class BestTimeToBuyOrSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        //Similar to sell or stock ii with fee
        //Suppose we are investing the money ,
        int buy = -prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            int tempBuy = buy;
            //If we have already sold , what would be the buying purse
            //U r deducting money from sell;
            buy = Math.max(buy, sell - prices[i]);
            //If we are selling the next one
            sell = Math.max(sell, prices[i] + tempBuy - fee);
        }

        return sell;
    }
}
