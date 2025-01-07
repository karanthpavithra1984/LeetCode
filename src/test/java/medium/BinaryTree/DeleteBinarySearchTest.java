package medium.BinaryTree;

import org.junit.Test;
import utils.BinaryTreeUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class DeleteBinarySearchTest {
    DeleteNode deleteBinarySearch = new DeleteNode();

    @Test
    public void testDeleteBinarySearch() {
        TreeNode treeNode = BinaryTreeUtils.getTreeNode();
        TreeNode treeNode1 = deleteBinarySearch.deleteNode(treeNode, 1);

        assertEquals(BinaryTreeUtils.flattenedTree(treeNode1), "5,3,2,4,8,7,6,9");


        treeNode = BinaryTreeUtils.getTreeNode();
        treeNode1 = deleteBinarySearch.deleteNode(treeNode, 5);

        assertEquals(BinaryTreeUtils.flattenedTree(treeNode1), "6,3,2,1,4,8,7,9");

    }
}
