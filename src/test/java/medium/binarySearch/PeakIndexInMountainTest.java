package medium.binarySearch;

import medium.BinarySearch.PeakIndexInMountain;
import org.junit.Test;

public class PeakIndexInMountainTest {
    PeakIndexInMountain peakIndexInMountain = new PeakIndexInMountain();

    @Test
    public void peakIndexInMountain() {
        assert peakIndexInMountain.peakIndexInMountainArray(new int[]{3,5,3,2,0}) == 1;
        assert peakIndexInMountain.peakIndexInMountainArray(new int[]{3,4,5,1}) == 2;
        assert peakIndexInMountain.peakIndexInMountainArray(new int[]{0,1,0}) == 1;

    }
}
