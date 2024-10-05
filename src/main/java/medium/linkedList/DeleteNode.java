package medium.linkedList;

import utils.ListNode;

/**
 * Time and Space Complexity - o(1)
 */

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
