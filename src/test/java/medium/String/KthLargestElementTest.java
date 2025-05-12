package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementTest {
    KthLargestElement k = new KthLargestElement();

    @Test
    public void kthLargestElement() {
        assertEquals(k.kthLargestNumber(new String[]{"10", "3", "6", "7"}, 4), "3");
    }
}
