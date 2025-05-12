package medium.Heap;

import org.junit.Test;

public class TopKFrequentTest {
    TopKFrequent topKFrequent = new TopKFrequent();

    @Test
    public void testTopKFrequent() {
        topKFrequent.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
    }
}
