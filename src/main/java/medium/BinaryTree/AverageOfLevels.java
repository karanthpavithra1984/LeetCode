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

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();


        if (root != null) {
            queue.add(root);
        }
        while (queue.size() > 0) {
            long sum = 0;
            int level = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode value = queue.remove();
                sum += value.val;
                level++;
                if (value.left != null) {
                    queue.add(value.left);
                }
                if (value.right != null) {
                    queue.add(value.right);
                }
            }
            values.add((double) sum / level);
        }

        return values;
    }
}
