package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(length(root1) + length(root2))
 * Space Complexity same as time complexity
 */

public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        preOrderTraversal(root1, list1);
        preOrderTraversal(root2, list2);
        return list1.equals(list2);
    }

    private void preOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;

        if(root.right == null && root.left == null) list.add(root.val);

        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);
    }
}
