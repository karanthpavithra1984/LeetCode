package medium.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class InsertIntoBinaryTreeTest {
    InertIntoBinaryTree insertIntoBinaryTree = new InertIntoBinaryTree();

    @Test
    public void testSearchVal1() {
        TreeNode treeNode = new TreeNode(4);
        //root = [4,2,7,1,3], val = 2
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(7);

        TreeNode treeNode1 = insertIntoBinaryTree.insertIntoBST(treeNode, 5);
        assertEquals(BinaryTreeUtils.flattenedTree(treeNode1), "4,2,1,3,7,5");

        //root = [40,20,60,10,30,50,70] val = 25
        treeNode = new TreeNode(40);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(60);
        treeNode.left.left = new TreeNode(10);
        treeNode.left.right = new TreeNode(30);
        treeNode.right.left = new TreeNode(50);
        treeNode.right.right = new TreeNode(70);

        treeNode1 = insertIntoBinaryTree.insertIntoBST(treeNode, 25);
        assertEquals(BinaryTreeUtils.flattenedTree(treeNode1), "40,20,10,30,25,60,50,70");
    }
}
