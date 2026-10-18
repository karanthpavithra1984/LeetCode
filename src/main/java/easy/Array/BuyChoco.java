package easy.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuyChoco {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int cost = prices[0] + prices[1];

        return cost <= money ? money - cost : money;
    }
}
