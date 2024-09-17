package medium.linkedList;

import utils.ListNode;

public class DeleteMiddle {

    /**
     * Time Complexity o(n) - Only one pass
     * Space Complexity o(1) -> Only pointers are used , objects arent created
     * @param head
     * @return
     */

    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return head;

        if(head.next == null) return null;


        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
