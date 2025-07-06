package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    public void testDiameterBinaryTree(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        treeNode.right = new TreeNode(3);

        assert diameterOfBinaryTree.diameterOfBinaryTree(treeNode) == 3;
    }
}
