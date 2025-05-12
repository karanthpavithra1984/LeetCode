package easy.Array;

import org.junit.Test;

public class DominantIndexTest {
    DominantIndex dominantIndex = new DominantIndex();

    @Test
    public void testDominantIndex() {
        assert dominantIndex.dominantIndex(new int[]{3, 6, 1, 0}) == 1;
        assert dominantIndex.dominantIndex(new int[]{1, 2, 3, 4}) == -1;
        assert dominantIndex.dominantIndex(new int[]{0, 0, 3, 2}) == -1;
    }
}
