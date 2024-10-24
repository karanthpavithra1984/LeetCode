package easy.prefixSum;

import org.junit.Test;

public class MinStartValueTest {
    MinStartValue minStartValue = new MinStartValue();

    @Test
    public void testMinStartValue(){
       assert  minStartValue.minStartValue(new int[]{-3,2,-3,4,2}) == 5;
    }
}
