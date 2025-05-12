package medium.BinaryTree;

import utils.TreeNode;

import java.util.*;

/**
 * Time Complexity = o(n)
 * Space Complexity o(n)
 */

public class BinaryLevelZigZagOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();

        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while (queue.size() > 0) {
            List<Integer> treeVals = new ArrayList<>();
            int size = queue.size();
            level++;
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
            if (level % 2 == 0) Collections.reverse(treeVals);
            values.add(treeVals);
        }

        return values;
    }
}
