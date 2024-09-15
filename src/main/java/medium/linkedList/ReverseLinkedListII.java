package medium.linkedList;

import utils.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode dummyList = newList;
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
        return newList.next;
    }
}
