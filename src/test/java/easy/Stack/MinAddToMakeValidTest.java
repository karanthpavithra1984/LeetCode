package easy.Stack;

import medium.Stack.MinAddToMakeValid;
import org.junit.Test;

public class MinAddToMakeValidTest {
    MinAddToMakeValid minAddToMakeValid = new MinAddToMakeValid();

    @Test
    public void testMinAddToMakeValid() {
        assert minAddToMakeValid.minAddToMakeValid("())") == 1;
        assert minAddToMakeValid.minAddToMakeValid("(((") == 3;
    }
}
