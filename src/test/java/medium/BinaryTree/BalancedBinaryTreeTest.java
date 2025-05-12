package medium.BinaryTree;

import easy.BinaryTree.BalancedBinaryTree;
import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {
    BalancedBinaryTree bt = new BalancedBinaryTree();

    @Test
    public void isBalanced() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        assertTrue(bt.isBalanced(treeNode));


        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.left.left = new TreeNode(3);
        treeNode1.left.left.left = new TreeNode(4);

        treeNode1.right = new TreeNode(2);
        treeNode1.right.right = new TreeNode(3);
        treeNode1.right.right.right = new TreeNode(4);

        assertTrue(bt.isBalanced(treeNode1));
    }
}
