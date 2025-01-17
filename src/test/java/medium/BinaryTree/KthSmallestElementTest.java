package medium.BinaryTree;

import com.sun.source.tree.Tree;
import org.junit.Test;
import utils.TreeNode;

public class KthSmallestElementTest {
    KthSmallestElement kthSmallestElement = new KthSmallestElement();

    @Test
    public void kthSmallestElement() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);

        treeNode.right = new TreeNode(4);

        assert  kthSmallestElement.kthSmallest(treeNode, 1) == 1;
    }
}
