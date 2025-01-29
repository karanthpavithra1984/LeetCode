package easy.Array;

import org.junit.Test;

public class SumOfUniqueElementsTest {
    SumOfUniqueElements s = new SumOfUniqueElements();

    @Test
    public void sumOfUniqueElements() {
       assert  s.sumOfUnique(new int[]{1,2,3,2}) == 4;
        assert  s.sumOfUnique(new int[]{1,1,1,1,1}) == 0;
        assert  s.sumOfUnique(new int[]{10,6,9,6,9,6,8,7}) == 25;
    }
}
