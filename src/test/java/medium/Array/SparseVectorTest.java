package medium.Array;

import org.junit.Test;

public class SparseVectorTest {
    SparseVector vector1 = new SparseVector(new int[]{1,0,0,2,3});
    SparseVector vector2 = new SparseVector(new int[]{0,3,0,4,0});

    @Test
    public void testAdd() {
        assert vector1.dotProduct(vector2) == 8;
    }
}
