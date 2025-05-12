package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Time Complexity = o(n)
 * Space Complexity o(n)
 */

public class BinaryLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> values = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList();

        if (root != null) {
            queue.add(root);
        }
        while (queue.size() > 0) {
            List<Integer> treeVals = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode value = queue.remove();
                treeVals.add(value.val);
                if (value.left != null) {
                    queue.add(value.left);
                }
                if (value.right != null) {
                    queue.add(value.right);
                }
            }
            values.add(0, treeVals);
        }

        return values;
    }
}
