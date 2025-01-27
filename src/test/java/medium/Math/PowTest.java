package medium.Math;

import org.junit.Test;

public class PowTest {
    Pow p = new Pow();

    @Test
    public void test() {
        assert p.myPow(2, -2) == 0.25;
        assert p.myPow(2, 2) == 4;
        assert p.myPow(2, 3) == 8;
        assert p.myPow(2, 10) == 1024;
        assert p.myPow(2.1 , 3) == 9.26100;
    }
}
