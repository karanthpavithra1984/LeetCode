package easy.Stack;

import org.junit.Test;

public class MaxDepthTest {
    MaxDepth maxDepth = new MaxDepth();
    @Test
    public void testMaxDepth(){
        assert maxDepth.maxDepth("(1+(2*3)+((8)/4))+1") == 3;
    }
}
