package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringTest {
    MultiplyString m = new MultiplyString();

    @Test
    public void multiply() {
        assertEquals(m.multiply("123", "456"), "56088");
        assertEquals(m.multiply("3", "2"), "6");
    }
}
