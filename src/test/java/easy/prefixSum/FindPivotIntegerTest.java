package easy.prefixSum;

import org.junit.Test;

public class FindPivotIntegerTest {
    FindPivotInteger findPivotInteger = new FindPivotInteger();

    @Test
    public void testFindPivotInteger(){
        assert findPivotInteger.pivotInteger(8) == 6;
        assert findPivotInteger.pivotInteger(1) == 1;
        assert findPivotInteger.pivotInteger(4) == -1;
    }
}
