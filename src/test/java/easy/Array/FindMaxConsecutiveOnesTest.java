package easy.Array;

import org.junit.Test;

public class FindMaxConsecutiveOnesTest {
    FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();

    @Test
    public void testFindMaxConsecutiveOnes(){
       assert  findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}) == 3;
       assert findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}) == 2;
    }
}
