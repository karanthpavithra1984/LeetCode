package easy.Array;

import org.junit.Test;

public class SmallestLetterGreaterThanTargetTest {
    SmallestLetterGreaterThanTarget smallestLetterGreaterThanTarget = new SmallestLetterGreaterThanTarget();

    @Test
    public void testSmallest(){
        assert smallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'c') == 'f';
        assert smallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z') == 'x';
    }
}
