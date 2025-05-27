package hard.dp;

import java.util.Arrays;

public class BestTimeToBuyOrSellStockIV {
    public int maxProfit(int[] prices, int k) {
        int[] tPrice = new int[k];
        int[] tProfit = new int[k];

        Arrays.fill(tPrice, prices[0]);
        for (int i = 1; i < prices.length; i++) {
            //Building upon previous , So it could be used for k transactions
            for (int j = 0; j < k; j++) {
                int prevProfit = j > 0 ? tProfit[j - 1] : 0;
                tPrice[j] = Math.min(tPrice[j], prices[i] - prevProfit);
                tProfit[j] = Math.max(tProfit[j], prices[i] - tPrice[j]);
            }
        }

        return tProfit[k-1];
    }
}
