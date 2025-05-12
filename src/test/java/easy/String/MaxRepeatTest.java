package easy.String;

import org.junit.Test;

public class MaxRepeatTest {
    MaxRepeating maxRepeating = new MaxRepeating();

    @Test
    public void testMaxRepeating() {
        assert maxRepeating.maxRepeating("ababc", "ab") == 2;
        assert maxRepeating.maxRepeating("ababc", "ba") == 1;
        assert maxRepeating.maxRepeating("ababc", "ac") == 0;
        assert maxRepeating.maxRepeating("ababac", "ac") == 1;
        assert maxRepeating.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba") == 5;
    }
}
