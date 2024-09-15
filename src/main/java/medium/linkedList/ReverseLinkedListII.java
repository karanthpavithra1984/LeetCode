package medium.linkedList;

import utils.ListNode;

/**
 * Time Complexity o(n) - if right is the end of the linked list
 * Space Complexity o(1) since sentinel is a new node which refers to head object
 */

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode sentinel = new ListNode(0, head);
        ListNode dummyList = sentinel;
        for(int i = 0; i < left -1 ; i++){
            dummyList = dummyList.next;
        }

        ListNode current = dummyList.next;

        for(int i = 0; i< right - left; i++){
            ListNode tmp = current.next;
            current.next = tmp.next;
            tmp.next = dummyList.next;
            dummyList.next = tmp;
        }
        return sentinel.next;
    }
}
