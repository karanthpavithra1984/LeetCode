package medium.BinaryTree;

import easy.BinaryTree.ConnectToRightNodeII;
import easy.BinaryTree.ConnectToRightNodeIII;
import org.junit.Test;
import utils.TreeNode;

public class ConnectToRightNodeIITest {
    ConnectToRightNodeII connectToRightNodeII = new ConnectToRightNodeII();


    @Test
    public void connectToRightNode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(7);

        connectToRightNodeII.connect(treeNode);
    }

    ConnectToRightNodeIII connectToRightNodeIII = new ConnectToRightNodeIII();
    @Test
    public void connectToRightNodeII() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.left.left = new TreeNode(6);
        treeNode.left.left.left.left = new TreeNode(12);
        treeNode.left.left.right = new TreeNode(7);
        treeNode.left.right.left = new TreeNode(9);
        treeNode.left.right.left.right = new TreeNode(13);

        treeNode.right = new TreeNode(3);
        treeNode.right.right = new TreeNode(7);
        treeNode.right.right.right = new TreeNode(10);
        treeNode.right.right.right.left = new TreeNode(11);


        connectToRightNodeIII.connect(treeNode);




    }
}
