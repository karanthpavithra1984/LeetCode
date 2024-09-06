package easy.mergeIntervals;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class SummaryRangesTest {
    SummaryRanges s = new SummaryRanges();

    @Test
    public void test() {
        assertEquals(GeneralUtils.convertToCommaSeperatedString(s.summaryRanges(new int[]{0, 1, 2, 4, 5, 7})), "0->2,4->5,7");
    }
}
