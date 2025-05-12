package medium.Matrix;

import org.junit.Test;

public class MaximalMatrixTest {
    MaximalMatrix maximalMatrix = new MaximalMatrix();

    @Test
    public void testMaximalMatrix() {
        assert maximalMatrix.maximalSquare(new char[][]{{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}) == 4;
    }
}
