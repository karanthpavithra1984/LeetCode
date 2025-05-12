package hard.linkedList;

import utils.ListNode;

/**
 * Time Complexity o(n);
 */

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode sentinnel = new ListNode(0, head);
        ListNode start = sentinnel;

        while (true) {
            ListNode kthNode = getKth(start, k);
            if (kthNode == null) {
                break;
            }

            ListNode nextInTheLine = kthNode.next;
            //Now reverse from start to nextInTheLine
            ListNode prev = kthNode.next;
            ListNode current = start.next;

            //Make sure you do it only till here
            while (current != nextInTheLine) {
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }

            //Now move the start
            ListNode temp = start.next;
            start.next = kthNode;
            start = temp;
        }

        return sentinnel.next;
    }

    private ListNode getKth(ListNode listNode, int k) {
        while (listNode != null && k > 0) {
            listNode = listNode.next;
            k--;
        }

        return listNode;
    }
}
