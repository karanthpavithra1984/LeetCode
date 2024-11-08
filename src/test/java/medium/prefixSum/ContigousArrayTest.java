package medium.prefixSum;

import medium.prefixsum.ContigousArray;
import org.junit.Test;

public class ContigousArrayTest {
    ContigousArray contigousArray = new ContigousArray();

    @Test
    public void testContigousArray(){
        assert contigousArray.findMaxLength(new int[]{0,1}) == 2;
        assert contigousArray.findMaxLength(new int[]{0,1,0}) == 2;
        assert contigousArray.findMaxLength(new int[]{0,1,0,1}) == 4;
    }
}
