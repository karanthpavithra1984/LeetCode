package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeStringsAlternativelyTest {
    MergeStringsAlternatively mergeStringsAlternatively = new MergeStringsAlternatively();

    @Test
    public void testMergeStringsAlternatively() {
        assertEquals(mergeStringsAlternatively.mergeAlternately("abc", "pqr"), "apbqcr");
        assertEquals(mergeStringsAlternatively.mergeAlternately("ab", "pqrs"), "apbqrs");
    }
}
