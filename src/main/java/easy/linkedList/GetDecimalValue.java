package easy.linkedList;

import utils.ListNode;

/**
 * Time complexity o(N)
 * space Complexity o(1)
 */


public class GetDecimalValue {

    public int getDecimalValue(ListNode node) {
        int num = node.val;

        while (node.next != null) {
            num = num * 2 + node.next.val;
            node = node.next;
        }

        return num;
    }
}
