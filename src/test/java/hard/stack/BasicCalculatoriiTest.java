package hard.stack;

import medium.Stack.BasicCalcluatorii;
import org.junit.Test;

public class BasicCalculatoriiTest {

    BasicCalcluatorii basicCalcluatorii = new BasicCalcluatorii();

    @Test
    public void testBasicCalculatorII() {
        assert basicCalcluatorii.calculate("1+1") == 2;
        assert basicCalcluatorii.calculate("3+2*2") == 7;
        assert basicCalcluatorii.calculate(" 3/2 ") == 1;
        assert basicCalcluatorii.calculate(" 3+5 / 2 ") == 5;
        assert basicCalcluatorii.calculate("1") == 1;
        assert basicCalcluatorii.calculate("0-2147483647") == -2147483647;
    }
}
