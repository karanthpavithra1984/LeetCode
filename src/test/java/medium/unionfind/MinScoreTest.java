package medium.unionfind;

import org.junit.Test;

public class MinScoreTest {
    MinScore minScore = new MinScore();

    @Test
    public void testMinScore() {
        assert minScore.minScore(4, new int[][]{{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}}) == 5;
        assert minScore.minScore(4, new int[][]{{1, 2, 2}, {1, 3, 4}, {3, 4, 7}}) == 2;
    }
}
