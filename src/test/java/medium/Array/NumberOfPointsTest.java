package medium.Array;

import org.junit.Test;
import utils.GeneralUtils;

public class NumberOfPointsTest {
    NumberOfPoints numberOfPoints = new NumberOfPoints();

    @Test
    public void testNumberOfPoints(){
        GeneralUtils.compareValues(
                numberOfPoints.getModifiedArray(5, new int[][]{{1,3,2},{2,4,3},{0,2,-2}}), new int[]{-2,0,3,5,3});
        GeneralUtils.compareValues(
                numberOfPoints.getModifiedArray(10, new int[][]{{2,4,6},{5,6,8},{1,9,-4}}), new int[]{0,-4,2,2,2,4,4,-4,-4,-4}
        );
    }
}
