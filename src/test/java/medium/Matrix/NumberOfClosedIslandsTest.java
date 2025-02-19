package medium.Matrix;

import org.junit.Test;

public class NumberOfClosedIslandsTest {
    NumberOfClosedIslands n = new NumberOfClosedIslands();
    
    @Test
    public void numberOfClosedIslands() {
        assert n.closedIsland(new int[][]{{1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}}) == 2;
    }
}
