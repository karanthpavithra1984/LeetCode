package medium.greedy;

import org.junit.Test;

public class MaximumSwapTest {
    MaximumSwap maximumSwap = new MaximumSwap();

    @Test
    public void maximumSwap() {
       assert  maximumSwap.maximumSwap(2736) == 7236;
       assert  maximumSwap.maximumSwap(9973) == 9973;
    }

    @Test
    public void maximumSwap2() {
        MaximumSwapII maximumSwap = new MaximumSwapII();

        assert maximumSwap.maximumSwap(10) == 10;
    }
}
