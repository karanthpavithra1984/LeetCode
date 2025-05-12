package easy.linkedList;

import utils.ListNode;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class WinnerOfTheGame {
    public String gameResult(ListNode head) {
        ListNode tmp = head;
        int result = 0;

        while (tmp != null && tmp.next != null) {
            result += tmp.val > tmp.next.val ? 1 : -1;
            tmp = tmp.next.next;
        }

        return result == 0 ? "Tie" : (result >= 1 ? "Even" : "Odd");
    }
}
