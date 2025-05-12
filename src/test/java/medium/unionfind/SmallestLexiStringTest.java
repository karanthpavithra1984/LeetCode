package medium.unionfind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestLexiStringTest {
    SmallestEquivalentString smallestEquivalentString = new SmallestEquivalentString();

    @Test
    public void testSmallestEquivalentString() {
        assertEquals(smallestEquivalentString
                .smallestEquivalentString("leetcode", "programs", "sourcecode"), "aauaaaaada");
    }
}
