package easy.prefixSum;

import org.junit.Test;

public class ReturnToBoundaryTest {
    ReturnToBoundary returnToBoundary = new ReturnToBoundary();

    @Test
    public void testReturntoBoundary() {
        assert returnToBoundary.returnToBoundaryCount(new int[]{2, 3, -5}) == 1;
        assert returnToBoundary.returnToBoundaryCount(new int[]{3, 2, -3, -4}) == 0;
    }
}
