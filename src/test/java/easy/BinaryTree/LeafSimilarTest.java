package easy.BinaryTree;

import medium.BinaryTree.LeafSimilar;
import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.assertTrue;

public class LeafSimilarTest {
    LeafSimilar leafSimilar = new LeafSimilar();

    @Test
    public void testLeafSimilar() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(1);

        treeNode.left.left = new TreeNode(6);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.left.right.right = new TreeNode(4);

        treeNode.right.left = new TreeNode(9);
        treeNode.right.right = new TreeNode(8);

        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(5);
        treeNode2.left.left = new TreeNode(6);
        treeNode2.left.right = new TreeNode(7);

        treeNode2.right = new TreeNode(1);
        treeNode2.right.left = new TreeNode(4);
        treeNode2.right.right = new TreeNode(2);
        treeNode2.right.right.left = new TreeNode(9);
        treeNode2.right.right.right = new TreeNode(8);

        assertTrue(leafSimilar.leafSimilar(treeNode, treeNode2));

    }
}
