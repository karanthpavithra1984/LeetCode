package easy.Array;

import org.junit.Test;

public class MissingNumberTest {
    MissingNumber missingNumber = new MissingNumber();

    @Test
    public void testMissingNumber(){
        assert missingNumber.missingNumber(new int[]{3,0,1}) == 2;
        assert missingNumber.missingNumber(new int[]{0,1}) == 2;
        assert missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}) == 8;
    }
}
