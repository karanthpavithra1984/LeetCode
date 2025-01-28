package easy.Array;

import org.junit.Test;

public class FindKthPositiveTest {
    FindKthPositive findKthPositive = new FindKthPositive();

    @Test
    public void findKthPositiveTest() {
       assert  findKthPositive.findKthPositive(new int[]{2,3,4,7,11},5) == 9;
    }
}
