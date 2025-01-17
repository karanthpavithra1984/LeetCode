package medium.BinaryTree;

import utils.TreeNode;

import java.util.Stack;

/**
 * Time Complexity , worst case o(n) , depends on the value of k.
 * Space Complexity , worst case o(n), depends on the value of k
 */

public class KthSmallestElement {
    int globalK;
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> stack = new Stack<>();
        globalK = k;
        kthSmallest(root, stack);
        return stack.pop();
    }

    private void kthSmallest(TreeNode root, Stack<Integer> stack) {
        if(root == null)return;

        if(stack.size()< globalK) {
            kthSmallest(root.left, stack);
            if(stack.size()< globalK)
                stack.push(root.val);
            kthSmallest(root.right, stack);
        }
    }
}
