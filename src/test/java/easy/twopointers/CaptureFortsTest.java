package easy.twopointers;

import org.junit.Test;

public class CaptureFortsTest {
    CaptureForts captureForts = new CaptureForts();

    @Test
    public void test() {
        assert captureForts.captureForts(new int[]{0,-1,-1,0,-1}) == 0;
        assert captureForts.captureForts(new int[]{-1,0,-1,0,1,1,1,-1,-1,-1}) == 1;
        assert captureForts.captureForts(new int[]{1,0,0,-1}) == 2;
        assert captureForts.captureForts(new int[]{1,0,0,-1,0,0,0,0,1}) == 4;
        assert captureForts.captureForts(new int[]{0,0,1,-1}) == 0;
    }
}
