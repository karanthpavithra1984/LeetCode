package easy.Matrix;

import org.junit.Test;

public class FloodFillTest {
    FloodFill ff = new FloodFill();

    @Test
    public void floodFill() {
        ff.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        ff.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0);
    }
}
