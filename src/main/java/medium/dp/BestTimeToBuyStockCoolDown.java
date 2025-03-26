package medium.dp;

public class BestTimeToBuyStockCoolDown {
    public int maxProfit(int[] prices) {
        //Lets buy the first Stock
        //Buying is negative and selling is positive
        int buy = -prices[0];
        int sell = 0; //We are not selling yet
        int cooldown = 0; //No cool down yet

        for(int i=1;i < prices.length; i++){
            int tempBuy = buy;
            //You have either entered cooldown or buying after cooldown
            buy = Math.max(buy, cooldown-prices[i]);
            //You either sell next or go to cooldown

            //If you are cooling down
            //You are either cooling down after the sell or staying in the cooldown
            cooldown = Math.max(cooldown, sell );

            //If you are selling
            sell = prices[i] + tempBuy;
        }

        return Math.max(sell, cooldown);
    }
}
