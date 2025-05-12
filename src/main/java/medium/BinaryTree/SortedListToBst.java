package medium.BinaryTree;

import utils.ListNode;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class SortedListToBst {
    List<Integer> list;

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) return null;

        /**
         * O(n)
         * Time complexity o(n)
         */
        this.list = new ArrayList<>();
        while (head != null) {
            this.list.add(head.val);
            head = head.next;
        }

        /**
         * o(n) time
         * space is going to o(n) - recursive stack
         */
        return recursiveTree(0, list.size() - 1);
    }

    private TreeNode recursiveTree(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = recursiveTree(left, mid - 1);
        root.right = recursiveTree(mid + 1, right);

        return root;
    }
}
