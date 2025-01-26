package medium.BinaryTree;

import com.sun.source.tree.Tree;
import org.junit.Test;
import utils.TreeNode;

public class LowestCommonAncestorTest {
    LowestCommonAncestor lca = new LowestCommonAncestor();

    @Test
    public void lowestCommonAncestor() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(5);
        treeNode.left.left = new TreeNode(6);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.left.right.right = new TreeNode(4);

        treeNode.right = new TreeNode(1);
        treeNode.right.left = new TreeNode(0);
        treeNode.right.right = new TreeNode(8);

        TreeNode p = treeNode.left;
        TreeNode q = treeNode.right;

        TreeNode treeNode1 = lca.lowestCommonAncestor(treeNode, p, q);
        assert treeNode1.val == 3;

        q= treeNode.left.right.right;

        treeNode1 = lca.lowestCommonAncestor(treeNode, p, q);
        assert treeNode1.val == 5;
    }
}
