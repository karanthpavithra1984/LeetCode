package medium.dp;

import org.junit.Test;

public class DecodeWaysTest {
    DecodeWays decodeWays = new DecodeWays();

    @Test
    public void testDecodeWays(){
        assert decodeWays.numDecoding("226") == 3;
    }
}
