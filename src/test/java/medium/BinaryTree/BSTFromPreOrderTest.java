package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class BSTFromPreOrderTest {
    BSTFromPreOrder bst = new BSTFromPreOrder();

    @Test
    public void test() {
        TreeNode treeNode = bst.bstFromPreorder(new int[]{8,5,1,7,10,12});
    }
}
