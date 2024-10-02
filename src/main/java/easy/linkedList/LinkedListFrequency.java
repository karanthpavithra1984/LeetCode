package easy.linkedList;

import utils.ListNode;

/**
 * Space Complexity - o(n) - New node to send the updated list
 * Time Complexity - o(n)
 */

public class LinkedListFrequency {
    public ListNode frequenciesOfElements(ListNode head) {

        int[] frequencies = new int[10000];

        ListNode tmp = head;

        while (tmp != null) {
            frequencies[tmp.val]++;
            tmp = tmp.next;
        }

        ListNode tmpNode = new ListNode(-1);
        ListNode updateList = tmpNode;

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                updateList.next = new ListNode(frequencies[i]);
                updateList = updateList.next;
            }
        }

        return tmpNode.next;

    }
}
