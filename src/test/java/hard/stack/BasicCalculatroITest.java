package hard.stack;

import org.junit.Test;

public class BasicCalculatroITest {
    BasicCalculatorI basicCalculatorI = new BasicCalculatorI();

    @Test
    public void testBasicCalculator(){
        assert basicCalculatorI.calculate("1 + 1") == 2;
        assert basicCalculatorI.calculate(" 2-1 + 2 ") == 3;
        assert basicCalculatorI.calculate("(1+(4+5+2)-3)+(6+8)") == 23;
        assert basicCalculatorI.calculate("1-(     -2)") == 3;
        assert basicCalculatorI.calculate("(7)-(0)+(4)") == 11;
    }
}
