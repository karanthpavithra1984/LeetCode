package medium.Matrix;

import org.junit.Test;

public class IslandPerimeterTest {
    IslandPerimeter islandPerimeter = new IslandPerimeter();

    @Test
    public void islandPerimeter() {
        assert islandPerimeter.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}) == 16;
    }
}
