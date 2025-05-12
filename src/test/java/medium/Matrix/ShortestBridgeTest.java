package medium.Matrix;

import org.junit.Test;

public class ShortestBridgeTest {
    ShortestBridge bridge = new ShortestBridge();

    @Test
    public void test() {
        assert bridge.shortestBridge(new int[][]{{0, 1}, {1, 0}}) == 1;
    }
}
