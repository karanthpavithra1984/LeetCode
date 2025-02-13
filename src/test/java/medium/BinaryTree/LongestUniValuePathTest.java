package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class LongestUniValuePathTest {
    LongestUniValuePath longestUniValuePath = new LongestUniValuePath();

    @Test
    public void longestUniValuePathTest() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(1);
        treeNode.right.right  = new TreeNode(5);

        assert longestUniValuePath.longestUnivaluePath(treeNode) == 2;
    }
}
