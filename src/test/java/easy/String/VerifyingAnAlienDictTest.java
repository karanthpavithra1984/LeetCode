package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VerifyingAnAlienDictTest {
    VerifyingAnAlienDict verifyingAnAlienDict = new VerifyingAnAlienDict();

    @Test
    public void test() {
        assertFalse(verifyingAnAlienDict.isAlienSorted(new String[]{"apple","app"},"abcdefghijklmnopqrstuvwxyz"));
        assertTrue(verifyingAnAlienDict.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
        assertFalse(verifyingAnAlienDict.isAlienSorted(new String[]{"word","world","row"},"worldabcefghijkmnpqstuvxyz"));
    }
}
