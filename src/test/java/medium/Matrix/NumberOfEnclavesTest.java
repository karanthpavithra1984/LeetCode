package medium.Matrix;

import org.junit.Test;

public class NumberOfEnclavesTest {
    NumberOfEnclaves n = new NumberOfEnclaves();

    @Test
    public void numberOfEnclaves() {
        assert n.numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}) == 3;
    }
}
