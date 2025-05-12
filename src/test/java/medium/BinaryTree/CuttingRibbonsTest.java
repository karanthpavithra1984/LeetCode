package medium.BinaryTree;

import medium.BinarySearch.CuttingRibbons;
import org.junit.Test;

public class CuttingRibbonsTest {
    CuttingRibbons cuttingRibbons = new CuttingRibbons();

    @Test
    public void test() {
        assert cuttingRibbons.maxLength(new int[]{7, 5, 9}, 4) == 4;
        assert cuttingRibbons.maxLength(new int[]{9, 7, 5}, 3) == 5;
    }
}
