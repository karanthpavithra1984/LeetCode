package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class SplitToPartsTest {

    SplitToParts splitToParts = new SplitToParts();

    @Test
    public void testSplitToParts() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        ListNode[] values = splitToParts.splitListToParts(listNode, 5);

        assert values != null;
        assert values.length == 5;
        assert values[0].val == 1;
        assert values[0].next == null;

        assert values[1].val == 2;
        assert values[1].next == null;

        assert values[2].val == 3;
        assert values[2].next == null;

        assert values[3] == null;
        assert values[4] == null;
    }
}
