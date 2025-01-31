package easy.Math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConfusingNumbersTest {
    ConfusingNumbers con = new ConfusingNumbers();

    @Test
    public void test() {
        assertTrue(con.confusingNumber(6));
        assertFalse(con.confusingNumber(11));
        assertFalse(con.confusingNumber(916));
    }
}
