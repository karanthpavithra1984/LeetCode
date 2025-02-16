package medium.Matrix;

import org.junit.Test;

public class WallsAndGatesTest {
    WallsAndGates wallsAndGates = new WallsAndGates();
    
    @Test
    public void test1() {
        int[][] rooms = new int[][]{{2147483647,-1,0,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647,-1,2147483647,-1},
                {0,-1,2147483647,2147483647}};
        wallsAndGates.wallsAndGates(rooms);
    }
}
