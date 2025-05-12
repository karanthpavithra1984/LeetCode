package hard.dp;

import medium.dp.BestTimeToBurOrSellStockII;
import org.junit.Test;

public class BestTimeToBuyOrSellStockIITest {
    BestTimeToBurOrSellStockII bestTimeToBurOrSellStockII = new BestTimeToBurOrSellStockII();

    @Test
    public void test() {
        assert bestTimeToBurOrSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}) == 7;
    }
}
