package medium.Array;

import org.junit.Test;

public class SingleNumberIITest {
    SingleNumberII singleNumberII = new SingleNumberII();

    @Test
    public void testSingleNumber(){
       assert  singleNumberII.singleNumber(new int[]{2,2,2,1}) == 1;
    }
}
