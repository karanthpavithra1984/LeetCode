package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class InvertTreeTest {
    InvertTree tree = new InvertTree();

    @Test
    public void invertTree() {
        //4,2,7,1,3,6,9
        TreeNode treeNode   = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);

      TreeNode invertedTree =  tree.invertTree(treeNode);
    }
}
