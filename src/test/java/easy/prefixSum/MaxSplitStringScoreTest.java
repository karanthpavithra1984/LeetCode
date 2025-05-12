package easy.prefixSum;

import org.junit.Test;

public class MaxSplitStringScoreTest {
    MaxSplitStringScore maxSplitStringScore = new MaxSplitStringScore();

    @Test
    public void testMaxSplitStringScore() {
        assert maxSplitStringScore.maxScore("011101") == 5;
        assert maxSplitStringScore.maxScore("00111") == 5;
        assert maxSplitStringScore.maxScore("00") == 1;
    }
}
