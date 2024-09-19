package medium.linkedList;

import utils.ListNode;

import java.util.List;

public class SwapTwoPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode sentinel =new ListNode(0, head);

        ListNode tmp = sentinel;

        while(head != null && head.next != null){
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            tmp.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            tmp =firstNode;
            head = firstNode.next;
        }

        return sentinel.next;
    }

}
