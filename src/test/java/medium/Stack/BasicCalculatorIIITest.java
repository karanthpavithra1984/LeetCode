package medium.Stack;

import hard.stack.BasicCalculatorIII;
import org.junit.Test;

public class BasicCalculatorIIITest {
    BasicCalculatorIII basicCalculatorIII = new BasicCalculatorIII();

    @Test
    public void testBasicCalculator(){
        assert basicCalculatorIII.calculate("1+1") == 2;
        assert basicCalculatorIII.calculate("6-4/2") == 4;
        assert basicCalculatorIII.calculate("2*(5+5*2)/3+(6/2+8)") == 21;
    }
}
