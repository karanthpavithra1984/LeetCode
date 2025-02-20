package medium.binarySearch;

import medium.BinarySearch.KokoEatingBananas;
import org.junit.Test;

public class KokoEatingBananasTest {
    KokoEatingBananas kokoEatingBanana = new KokoEatingBananas();

    @Test
    public void testKokoEatingBananas() {
        assert kokoEatingBanana.minEatingSpeed(new int[]{3,6,7,11}, 8) == 4;
    }
}
