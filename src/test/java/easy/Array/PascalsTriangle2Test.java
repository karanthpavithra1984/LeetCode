package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class PascalsTriangle2Test {
    PascalsTriangle2 pascalsTriangle = new PascalsTriangle2();

    @Test
    public void testPascalTriangle(){
        assertEquals(GeneralUtils.convertToCommaSeperatedString(pascalsTriangle.getRow(0)), "1");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(pascalsTriangle.getRow(1)), "1,1");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(pascalsTriangle.getRow(2)), "1,2,1");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(pascalsTriangle.getRow(3)), "1,3,3,1");
    }
}
