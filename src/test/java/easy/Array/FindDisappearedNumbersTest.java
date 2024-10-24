package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class FindDisappearedNumbersTest {
    FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();

    @Test
    public void testFindDisappearedNumbers(){
       assertEquals(
               GeneralUtils.convertToCommaSeperatedString(
                       findDisappearedNumbers.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})), "5,6");

        assertEquals(
                GeneralUtils.convertToCommaSeperatedString(
                        findDisappearedNumbers.findDisappearedNumbers(new int[]{1,1})), "2");


    }
}
