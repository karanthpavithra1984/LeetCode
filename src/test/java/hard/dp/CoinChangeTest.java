package hard.dp;

import medium.dp.CoinChange;
import medium.dp.CoinChangeTD;
import org.junit.Test;

public class CoinChangeTest {
    CoinChange coinChangeTD = new CoinChange();

    @Test
    public void testCoinChange(){
        coinChangeTD.coinChange(new int[]{1,2,5}, 11);
    }
}
