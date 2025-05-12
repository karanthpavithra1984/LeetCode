package easy.Stack;

import org.junit.Test;
import utils.GeneralUtils;

public class FinalPricesTest {
    FinalPrices finalPrices = new FinalPrices();

    @Test
    public void testFinalPrices() {
        GeneralUtils.compareValues(finalPrices.finalPrices(new int[]{8, 4, 6, 2, 3}), new int[]{4, 2, 4, 2, 3});
        GeneralUtils.compareValues(finalPrices.finalPrices(new int[]{1, 2, 3, 4, 5}), new int[]{1, 2, 3, 4, 5});
        GeneralUtils.compareValues(finalPrices.finalPrices(new int[]{10, 1, 1, 6}), new int[]{9, 0, 1, 6});
        GeneralUtils.compareValues(finalPrices.finalPrices(new int[]{8, 7, 4, 2, 8, 1, 7, 7, 10, 1}), new int[]{1, 3, 2, 1, 7, 0, 0, 6, 9, 1});
    }
}
