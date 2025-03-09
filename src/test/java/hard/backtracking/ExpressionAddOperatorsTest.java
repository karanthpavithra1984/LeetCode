package hard.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class ExpressionAddOperatorsTest {
    ExpressionAddOperators exp = new ExpressionAddOperators();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(exp.addOperators("105",5)), "");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(
                exp.addOperators("123",6).stream()),"1+2+3->1*2*3");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(
                exp.addOperators("12",2).stream()),"1*2");

    }
}
