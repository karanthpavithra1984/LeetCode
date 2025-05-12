package easy.Array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;

public class ValidWordSquareTest {
    ValidWordSquare validWordSquare = new ValidWordSquare();

    @Test
    public void testValidWordSquare() {
//        assertTrue(validWordSquare.validWordSquare(Arrays.asList("abcd","bnrt","crmy","dtye")));
//        assertTrue(validWordSquare.validWordSquare(Arrays.asList("abcd","bnrt","crm","dt")));
//        assertFalse(validWordSquare.validWordSquare(Arrays.asList("ball","area","read","lady")));
        assertFalse(validWordSquare.validWordSquare(Arrays.asList("ball", "asee", "let", "lep")));
        assertFalse(validWordSquare.validWordSquare(Arrays.asList("abc", "b")));
    }
}
