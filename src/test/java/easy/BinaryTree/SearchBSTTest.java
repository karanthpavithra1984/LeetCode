package easy.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class SearchBSTTest {
    SearchBST searchBST = new SearchBST();

    @Test
    public void testSearchVal1() {
        TreeNode treeNode = new TreeNode(4);
        //root = [4,2,7,1,3], val = 2
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(7);

        TreeNode treeNode1 = searchBST.searchBST(treeNode, 2);
        assert treeNode1.val == 2;
        assert treeNode1.left.val == 1;
        assert treeNode1.right.val == 3;

        treeNode1 = searchBST.searchBST(treeNode, 5);
        assert treeNode1 == null;

        treeNode1 = searchBST.searchBST(treeNode, 1);
        assert treeNode1.val == 1;
        assert treeNode1.left == null;
        assert treeNode1.right == null;
    }
}
