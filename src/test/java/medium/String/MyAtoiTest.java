package medium.String;

import org.junit.Test;

public class MyAtoiTest {
    MyAtoi myAtoi = new MyAtoi();

    @Test
    public void test() {
        assert myAtoi.myAtoi("2147483646") == 2147483646;
        assert myAtoi.myAtoi("21474836460") == 2147483647;
        assert myAtoi.myAtoi("-91283472332") == -2147483648;
        assert myAtoi.myAtoi(" -042") == -42;
        assert myAtoi.myAtoi("1337c0d3") == 1337;
        assert myAtoi.myAtoi("42") == 42;
        assert myAtoi.myAtoi("0-1") == 0;

    }
}
