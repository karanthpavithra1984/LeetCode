package medium.Matrix;

import org.junit.Test;

public class NearestExitInTheMazeTest {
    NearestExitInTheMaze nearestExitInTheMaze = new NearestExitInTheMaze();
    
    @Test
    public void test() {
        assert nearestExitInTheMaze.nearestExit(new char[][]{{'+','+','.','+'},
                {'.','.','.','+'},{'+','+','+','.'}}, new int[]{1,2}) == 1;
    }
}
