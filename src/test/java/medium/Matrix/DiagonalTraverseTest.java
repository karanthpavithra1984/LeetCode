package medium.Matrix;

import org.junit.Test;
import utils.GeneralUtils;

public class DiagonalTraverseTest {
    DiagonalTraverse diagonalTraverse = new DiagonalTraverse();

    @Test
    public void test(){
        GeneralUtils.compareValues(
                diagonalTraverse.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}),
                        new int[]{1,2,4,7,5,3,6,8,9});
    }
}
