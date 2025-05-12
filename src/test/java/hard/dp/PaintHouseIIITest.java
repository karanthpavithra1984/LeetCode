package hard.dp;

import org.junit.Test;

public class PaintHouseIIITest {
    PaintHouseIII paintHouseIII = new PaintHouseIII();

    @Test
    public void testPaintHouse(){
        paintHouseIII.minCost(new int[]{0,0,0,0,0}, new int[][]{{1,10},{10,1},{10,1},{1,10},{5,1}},  5,
                2, 3);
    }
}
