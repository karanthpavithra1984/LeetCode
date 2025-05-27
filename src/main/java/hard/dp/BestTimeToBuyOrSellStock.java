package hard.dp;

public class BestTimeToBuyOrSellStock {
    public int maxProfit(int[] prices) {
        int t1Price = prices[0], t2Price = prices[0], t1Profit = 0, t2Profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - t1Price;
            //Get the next lowest Price
            t1Price = Math.min(t1Price, prices[i]);
            t1Profit = Math.max(t1Profit, profit);//So this is the first Transaction Profit

            //Lets reinvest it
            t2Price = Math.min(t2Price, prices[i] - t1Profit);
            //Lets try to get the maximum profit
            t2Profit = Math.max(t2Profit, prices[i] - t2Price);
        }

        return t2Profit;
    }
}
