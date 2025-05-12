package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {
    CountAndSay countAndSay = new CountAndSay();

    @Test
    public void countAndSay() {
        assertEquals(countAndSay.countAndSay(3), "21");
        assertEquals(countAndSay.countAndSay(1), "1");
        assertEquals(countAndSay.countAndSay(2), "11");
        assertEquals(countAndSay.countAndSay(4), "1211");

    }
}
