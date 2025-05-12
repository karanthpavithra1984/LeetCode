package medium.slidingWindow;

import org.junit.Test;

public class PermutationStringTest {
    PermutationInString p = new PermutationInString();

    @Test
    public void testPermutation() {
        p.checkInclusion("ab", "eidbaooo");
    }
}
