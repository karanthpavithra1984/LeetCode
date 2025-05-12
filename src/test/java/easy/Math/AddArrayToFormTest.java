package easy.Math;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class AddArrayToFormTest {
    AddArrayToForm addArrayToForm = new AddArrayToForm();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(addArrayToForm.addToArrayForm(new int[]{0}, 12)), "1,2");
        assertEquals(GeneralUtils.convertToCommaSeperatedString(addArrayToForm.addToArrayForm(new int[]{2, 1, 5}, 806)), "1,0,2,1");
        assertEquals(
                GeneralUtils.convertToCommaSeperatedString(addArrayToForm.addToArrayForm(new int[]{1, 2, 3, 4}, 34)), "1,2,6,8");
    }
}
