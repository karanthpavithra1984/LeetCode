package medium.Matrix;

import org.junit.Test;

public class SorroundedRegionsTest {
    SurroundedRegions surroundedRegions = new SurroundedRegions();
    
    @Test
    public void testSorroundedRegions() {
        surroundedRegions.solve(new char[][]{{'X'}});
        surroundedRegions.solve(new char[][]
                {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}});
    }
}
