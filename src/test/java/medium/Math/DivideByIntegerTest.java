package medium.Math;

import org.junit.Test;

public class DivideByIntegerTest {
    DivideTwoIntegers divideByInteger = new DivideTwoIntegers();

    @Test
    public void divideByInteger() {
        assert divideByInteger.divide(10,3) == 3;
        assert divideByInteger.divide(694, 53) == 13;
        assert divideByInteger.divide(10,5) == 2;
        assert divideByInteger.divide(-2147483648,-1 ) == 2147483647;
        assert divideByInteger.divide(10,3) == 3;
        assert divideByInteger.divide(7,-3) == -2;
    }
}
