package easy.Heap;

import org.junit.Test;

public class FindMinOrMaxTest {
    FindMinOrMax findMinOrMax = new FindMinOrMax();

    @Test
    public void testFindMinOrMax() {
        assert findMinOrMax.findNonMinOrMax(new int[]{3, 2, 1, 4}) == 2;
        assert findMinOrMax.findNonMinOrMax(new int[]{1, 2}) == -1;
        assert findMinOrMax.findNonMinOrMax(new int[]{2, 1, 3}) == 2;
    }
}
