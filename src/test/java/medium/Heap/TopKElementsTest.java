package medium.Heap;

import org.junit.Test;
import utils.GeneralUtils;

public class TopKElementsTest {
    TopKElements topKElements = new TopKElements();

    @Test
    public void testTopKElements() {
       GeneralUtils.compareValues(topKElements.topKFrequent(new int[]{1,1,1,2,2,3} , 2), new int[]{2,1});
       GeneralUtils.compareValues(topKElements.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2 ) , new int[]{2, -1});
    }
}
