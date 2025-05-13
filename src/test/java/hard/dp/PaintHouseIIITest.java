package hard.dp;

import org.junit.Test;

public class PaintHouseIIITest {
    PaintHouseIII paintHouseIII = new PaintHouseIII();
    PaintHouseIIIMy paintHouseIIIMy = new PaintHouseIIIMy();

    @Test
    public void testPaintHouse(){
//        paintHouseIIIMy.minCost(new int[]{0,0,0,0,0}, new int[][]{{1,10},{10,1},{10,1},{1,10},{5,1}},  5,
//                2, 3);
        paintHouseIIIMy.minCost(new int[]{3,1,2,3}, new int[][]{{1,1,1},{1,1,1},{1,1,1},{1,1,1}}, 4,3,3);
//        paintHouseIII.minCost(new int[]{0,0,0,0,0}, new int[][]{{1,10},{10,1},{10,1},{1,10},{5,1}},  5,
//                2, 3);
    }
}
