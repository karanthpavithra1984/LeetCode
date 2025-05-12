package easy.Stack;

import medium.Stack.ValidateStackSequence;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidStackSequenceTest {
    ValidateStackSequence validateStackSequence = new ValidateStackSequence();

    @Test
    public void testValidStackSequence() {
        assertTrue(validateStackSequence.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
        assertFalse(validateStackSequence.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }
}
