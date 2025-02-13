package medium.Math;

import org.junit.Test;

public class DivideByIntegerTest {
    DivideByInteger divideByInteger = new DivideByInteger();

    @Test
    public void divideByInteger() {
        assert divideByInteger.divide(10,5) == 2;
        assert divideByInteger.divide(-2147483648,-1 ) == 2147483647;
        assert divideByInteger.divide(10,3) == 3;
        assert divideByInteger.divide(7,-3) == -2;
    }
}
