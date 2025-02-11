package medium.Stack;

import org.junit.Test;

public class StockSpannerTest {

    @Test
    public void test() {
        StockSpanner stockSpanner = new StockSpanner();
        assert stockSpanner.next(100) == 1;
        assert stockSpanner.next(80) == 1;
        assert stockSpanner.next(60) == 1;
        assert stockSpanner.next(70) == 2;
        assert stockSpanner.next(60) == 1;
        assert stockSpanner.next(75) == 4;
        assert stockSpanner.next(85) == 6;
    }
}
