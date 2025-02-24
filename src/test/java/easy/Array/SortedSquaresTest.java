package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

public class SortedSquaresTest {
    SortedSquares squares = new SortedSquares();

    @Test
    public void test() {
        GeneralUtils.compareValues(squares.sortedSquares(new int[]{-4,-1,0,3,10}),
                new int[]{0,1,9,16,100});
        GeneralUtils.compareValues(squares.sortedSquares(new int[]{-7,-3,2,3,11}), new int[]{4,9,9,49,121});
    }
}
