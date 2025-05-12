package medium.ZeroOneKP;

import org.junit.Test;

import java.util.Arrays;

public class ProfitWeightTest {
    @Test
    public void testProfitWeight() {
        ProfitWeight profitWeight = new ProfitWeight();
        profitWeight.dfs(Arrays.asList(4, 4, 7, 1), Arrays.asList(5, 2, 3, 1), 8);
    }
}
