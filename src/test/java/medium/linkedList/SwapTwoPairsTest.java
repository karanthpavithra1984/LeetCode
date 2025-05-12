package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class SwapTwoPairsTest {
    SwapTwoPairs swapTwoPairs = new SwapTwoPairs();

    @Test
    public void testSwapPairs() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        ListNode listNode1 = swapTwoPairs.swapPairs(listNode);

        assert listNode1 != null;
        assert listNode1.val == 2;

        assert listNode1.next != null;
        assert listNode1.next.val == 1;

        assert listNode1.next.next != null;
        assert listNode1.next.next.val == 4;

        assert listNode1.next.next.next != null;
        assert listNode1.next.next.next.val == 3;

    }
}
