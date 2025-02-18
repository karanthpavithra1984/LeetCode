package medium.Matrix;

import org.junit.Test;

public class ShortestPathBinaryMatrixTest {
    ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();

    @Test
    public void testShortestPath() {
       assert shortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0,1},{1,0}}) == 2;
    }
}
