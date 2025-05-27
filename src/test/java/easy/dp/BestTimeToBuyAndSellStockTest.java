package easy.dp;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void testBestBuyAndSellStock(){
        bestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4});
    }
}
