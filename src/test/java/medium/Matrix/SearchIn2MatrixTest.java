package medium.Matrix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SearchIn2MatrixTest {
    Searchin2Matrix sol = new Searchin2Matrix();
    
    @Test
    public void testSol(){
        assertTrue(sol.searchMatrix(new int[][]{{1,4,7,11,15}
        ,{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5));
    }
}
