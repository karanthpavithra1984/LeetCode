package medium.prefixSum;

import medium.prefixsum.RandomPickWithWeight;
import org.junit.Test;

public class RandomPickWithWeightTest {
   RandomPickWithWeight randomPickWithWeight;

   @Test
    public void test() {
       randomPickWithWeight = new RandomPickWithWeight(new int[]{3,14,1,7});

       assert randomPickWithWeight.pickIndex() == 1;

       randomPickWithWeight = new RandomPickWithWeight(new int[]{1,3,4,5,7,8,9});

       assert randomPickWithWeight.pickIndex() == 1;


   }
}
