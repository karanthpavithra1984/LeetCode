package easy.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidWordAbbreviationTest {
    ValidWordAbbreviation validWordAbbreviation = new ValidWordAbbreviation();

    @Test
    public void testValidWordAbbreviation() {
//        assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization","i12iz4n"));
//        assertFalse(validWordAbbreviation.validWordAbbreviation("apple", "a2e"));
        assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization", "i5a11o1"));
    }
}
