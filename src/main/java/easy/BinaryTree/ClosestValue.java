package easy.BinaryTree;

import utils.TreeNode;

/**
 * Worst case o(n), provided the value is on an unbalanced tree
 * Space complexity o(1)
 */

public class ClosestValue {
    public int closestValue(TreeNode root, double target) {
        int ceil = root.val;
        int floor = root.val;

        while (root != null) {
            if (root.val > target) {
                ceil = root.val;
                root = root.left;
            } else {
                floor = root.val;
                root = root.right;
            }
        }
        double diff1 = Math.abs(ceil - target);
        double diff2 = Math.abs(floor - target);

        if(diff1 == diff2) return Math.min(ceil, floor);
        return diff1 > diff2 ? floor : ceil;
    }
}
