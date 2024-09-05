package easy.mergeIntervals;

import org.junit.Test;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SummaryRangesTest {
    SummaryRanges s = new SummaryRanges();

    @Test
    public void test() {
        assertEquals(s.summaryRanges(new int[]{0,1,2,4,5,7}).stream().collect(Collectors.joining(",")), "0->2,4->5,7" );
    }
}
