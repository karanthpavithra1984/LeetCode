package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class GoodNodeTest {
    GoodNode goodNode = new GoodNode();

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);

        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        assert goodNode.goodNodes(root) == 4;

        root = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(4);

        assert goodNode.goodNodes(root) == 4;

    }
}
