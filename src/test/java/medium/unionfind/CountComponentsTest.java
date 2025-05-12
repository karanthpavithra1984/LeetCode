package medium.unionfind;

import org.junit.Test;

public class CountComponentsTest {
    CountComponents countComponents = new CountComponents();

    @Test
    public void testCountComponents() {
        assert countComponents.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}) == 2;
    }
}
