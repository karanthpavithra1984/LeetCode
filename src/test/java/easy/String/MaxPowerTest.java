package easy.String;

import org.junit.Test;

public class MaxPowerTest {
    MaxPower m = new MaxPower();

    @Test
    public void testMaxPower() {
        assert m.maxPower("leetcode") == 2;
        assert m.maxPower("abbcccddddeeeeedcba") == 5;
        assert m.maxPower("leetcodeeee") == 4;
    }
}
