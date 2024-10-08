package easy.String;

import org.junit.Test;

public class PrefixCountTest {
    PrefixCount prefixCount = new PrefixCount();

    @Test
    public void testPrefixCount(){
        assert prefixCount.prefixCount(new String[]{"pay","attention","practice","attend"},"at") == 2;
        assert prefixCount.prefixCount(new String[]{"leetcode","win","loops","success"}, "code") == 0;
    }
}
