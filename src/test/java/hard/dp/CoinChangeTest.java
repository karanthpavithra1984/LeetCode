package hard.dp;

import medium.dp.CoinChangeTD;
import org.junit.Test;

public class CoinChangeTest {
    CoinChangeTD coinChangeTD = new CoinChangeTD();

    @Test
    public void testCoinChange(){
        coinChangeTD.coinChange(new int[]{1,2,5}, 11);
    }
}
