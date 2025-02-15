package medium.twopointers;

import org.junit.Test;

public class StringCompressTest {
    StringCompress sc = new StringCompress();
    @Test
    public void test() {
        assert sc.compress(new char[]{'a','a','a','b','b','a','a'}) == 6;
        assert sc.compress(new char[]{'a'}) == 1;
        assert sc.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}) == 4;
        assert sc.compress(new char[]{'a','a','b','b','c','c','c'}) == 6;
    }
}
