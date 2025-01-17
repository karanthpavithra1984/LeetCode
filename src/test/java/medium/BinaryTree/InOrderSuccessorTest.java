package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class InOrderSuccessorTest {
    InOrderSuccessor inOrderSuccessor = new InOrderSuccessor();

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        assert inOrderSuccessor.inorderSuccessor(treeNode, treeNode.left).val == 2;
    }
}
