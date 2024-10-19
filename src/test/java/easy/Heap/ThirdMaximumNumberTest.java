package easy.Heap;

import org.junit.Test;

public class ThirdMaximumNumberTest {
    ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

    @Test
    public void testThirdMaximumNumber(){
        assert thirdMaximumNumber.thirdMax(new int[]{3,2,1}) == 1;
        assert thirdMaximumNumber.thirdMax(new int[]{1,2}) == 2;
        assert thirdMaximumNumber.thirdMax(new int[]{2,2,3,1}) == 1;
        assert thirdMaximumNumber.thirdMax(new int[]{5,4,2,2,3,1}) == 3;
    }
}
