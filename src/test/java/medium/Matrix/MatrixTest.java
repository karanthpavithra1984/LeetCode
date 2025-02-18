package medium.Matrix;

import org.junit.Test;

public class MatrixTest {
    Matrix01 matrix01 = new Matrix01();

    @Test
    public void test() {
        matrix01.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
        matrix01.updateMatrix(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
    }
}
