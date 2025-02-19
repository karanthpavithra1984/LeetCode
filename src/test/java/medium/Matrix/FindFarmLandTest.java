package medium.Matrix;

import org.junit.Test;

public class FindFarmLandTest {
    FindFarmLand farmLand = new FindFarmLand();

    @Test
    public void testFarmLand(){
        farmLand.findFarmland(new int[][]{{1,0,0},{0,1,1},{0,1,1}});
    }
}
