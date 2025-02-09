package easy.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;

public class MinimumDifferenceBetweenNodesTest {
    MinimumDifferenceBetweenNodes minimumDifferenceBetweenNodes = new MinimumDifferenceBetweenNodes();

    @Test
    public void testMinimumDifferenceBetweenNodes() {
        assert minimumDifferenceBetweenNodes.getMinimumDifference(BinaryTreeUtils.getTreeNode()) == 1;
    }
}
