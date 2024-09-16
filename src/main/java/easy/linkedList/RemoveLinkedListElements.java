package easy.linkedList;

import utils.ListNode;

public class RemoveLinkedListElements {

    /**
     * Time Complexity - o(N)
     * Space Complexity - o(1) - its all pointed to the same object , only the pointers are moving
     * @param head
     * @param val
     * @return
     */

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0, head);
        ListNode current = sentinel;

        while (head != null) {
            if (val == head.val) {
                current.next = head.next;
            } else {
                current = current.next;
            }

            head = head.next;
        }

        return sentinel.next;
    }
}
