package easy.Array;

import utils.TreeNode;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(logn (rescursion stack) + n (space required to create the treeNode) ) - Considering log n is less than n , its n
 */
public class SortedArrayToBst {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode buildTreeNode(int[] nums, int start, int end) {
        if (start > end) return null;
        int midIndex = (start + end) / 2;

        TreeNode treeNode = new TreeNode();
        treeNode.val = nums[midIndex];
        treeNode.left = buildTreeNode(nums, start, midIndex - 1);
        treeNode.right = buildTreeNode(nums, midIndex + 1, end);

        return treeNode;
    }
}
