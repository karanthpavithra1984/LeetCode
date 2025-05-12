package easy.prefixSum;

import org.junit.Test;

public class FindTheHighestAltitudeTest {
    FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

    @Test
    public void testFindTheHighestAltitude() {
        assert findTheHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}) == 1;
        assert findTheHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}) == 0;
        assert findTheHighestAltitude.largestAltitude(new int[]{52, -91, 72}) == 52;
    }
}
