package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree d = new DiameterOfBinaryTree();

    @Test
    public void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assert d.diameterOfBinaryTree(root) == 3;
    }
}

