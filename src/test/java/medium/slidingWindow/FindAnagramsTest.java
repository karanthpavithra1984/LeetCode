package medium.slidingWindow;

import org.junit.Test;

public class FindAnagramsTest {
    FindAnagrams findAnagrams = new FindAnagrams();

    @Test
    public void testFindAnagrams() {
        findAnagrams.findAnagrams("cbaebabacd", "abc");
    }
}
