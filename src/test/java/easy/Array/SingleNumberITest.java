package easy.Array;

import org.junit.Test;

public class SingleNumberITest {
    SingleNumberI singleNumberI = new SingleNumberI();

    @Test
    public void testSingleNumberI(){
       assert  singleNumberI.singleNumber(new int[]{2,2,1}) == 1;
    }
}
