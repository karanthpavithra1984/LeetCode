package easy.prefixSum;

import org.junit.Test;

public class FindPivotIndexTest {
    FindPivotIndex findPivotIndex = new FindPivotIndex();

    @Test
    public void testFindPivotIndex() {
        assert findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}) == 3;
        assert findPivotIndex.pivotIndex(new int[]{1, 2, 3}) == -1;
    }
}
