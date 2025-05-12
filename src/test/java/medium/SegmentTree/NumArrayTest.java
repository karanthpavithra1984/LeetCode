package medium.SegmentTree;

import medium.segmentTree.NumArray;
import org.junit.Test;

public class NumArrayTest {
    NumArray numArray;

    @Test
    public void testNumArray() {
        numArray = new NumArray(new int[]{1, 3, 5, 6, 7, 8});
        numArray.update(1, 10);
    }
}
