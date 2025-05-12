package easy.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * space complexity - o(1) since we create a new reference
 */

public class DeleteDuplicates {
    /**
     * Remove duplicates
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode deduped = head;

        while (deduped != null && deduped.next != null) {
            if (deduped.val == deduped.next.val) {
                deduped.next = deduped.next.next;
            } else {
                deduped = deduped.next;
            }
        }


        return head;
    }
}
