package hard.Matrix;

import hard.matrix.SellingWoods;
import org.junit.Test;

public class SellingWoodsTest {
    SellingWoods s = new SellingWoods();

    @Test
    public void test() {
        assert s.sellingWood(9, 7, new int[][]{{4, 3, 2}, {5, 3, 16}, {4, 4, 18}, {8, 7, 6}}) == 54;
        assert s.sellingWood(3, 5, new int[][]{{1, 4, 2}, {2, 2, 7}, {2, 1, 3}}) == 19;
    }
}
