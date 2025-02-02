package medium.Array;

import org.junit.Test;

public class GetLargestOutlierTest {
    GetLargestOutlier getLargestOutlier = new GetLargestOutlier();

    @Test
    public void test() {
        assert getLargestOutlier.getLargestOutlier(new int[]{6,-31,50,-35,41,37,-42,13}) == -35;
        assert getLargestOutlier.getLargestOutlier(new int[]{1,1,1,1,1,5,5}) == 5;
        assert getLargestOutlier.getLargestOutlier(new int[]{-108,-108,-517}) == -517;
        assert getLargestOutlier.getLargestOutlier(new int[]{2,3,5,10}) == 10;
        assert getLargestOutlier.getLargestOutlier(new int[]{-2,-1,-3,-6,4}) == 4;


    }
}
