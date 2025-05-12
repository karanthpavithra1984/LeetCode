package medium.BinaryTree;

import utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class LowestCommonAncestorIV {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        //Get them to a set/list
        Set<Integer> values = new HashSet<>();
        for (TreeNode node : nodes)
            values.add(node.val);

        return lca(root, values);
    }

    private TreeNode lca(TreeNode root, Set<Integer> values) {
        if (root == null || values.contains(root.val))
            return root;

        TreeNode left = lca(root.left, values);
        TreeNode right = lca(root.right, values);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

}
