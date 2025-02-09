package medium.linkedList;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Use Set instead of List to reduce the time.
 *
 * Time Complexity o(n)
 * space complexity o(1)
 *
 */

public class ModifiedList {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode sentinel = new ListNode(0, head);
        ListNode tmp = sentinel;
        Set<Integer> numList = new HashSet<>();
        for(int num: nums) {
            numList.add(num);
        }
        while (head != null) {
            if (numList.contains(head.val)) {
                tmp.next = head.next;
            } else {
                tmp = tmp.next;
            }
            head = head.next;
        }

        return sentinel.next;
    }
}
