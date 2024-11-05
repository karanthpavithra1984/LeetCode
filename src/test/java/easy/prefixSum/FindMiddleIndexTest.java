package easy.prefixSum;

import org.junit.Test;

public class FindMiddleIndexTest {
    FindMiddleInIndex findMiddleInIndex = new FindMiddleInIndex();

    @Test
    public void testFindMiddleIndex(){
        assert findMiddleInIndex.findMiddleIndex(new int[]{2,3,-1,8,4}) == 3;
        assert findMiddleInIndex.findMiddleIndex(new int[]{-1,1,4}) == 2;
        assert findMiddleInIndex.findMiddleIndex(new int[]{2,5}) == -1;
    }
}
