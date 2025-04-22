package medium.linkedList;

import utils.ListNode;

public class RemoveNthFromEnd {

    /**
     * Time Complexity o(n) - Passes through each node in the linked list
     * Space Complexity o(1) - Only pointers are moved , object remains the same
     * @param head
     * @param n
     * @return
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = n+1;
        ListNode sentinel = new ListNode(0, head);
        ListNode firstTraverse = sentinel;
        ListNode secondTraverse = sentinel;

        while(count >0){
            firstTraverse = firstTraverse.next;
            count--;
        }

        while(firstTraverse != null){
            firstTraverse = firstTraverse.next;
            secondTraverse = secondTraverse.next;
        }

        secondTraverse.next = secondTraverse.next.next;

        return sentinel.next;
    }

}
