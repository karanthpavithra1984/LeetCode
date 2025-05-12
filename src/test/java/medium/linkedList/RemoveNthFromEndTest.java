package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class RemoveNthFromEndTest {

    RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

    @Test
    public void removeNthFromEnd() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);


        ListNode result = removeNthFromEnd.removeNthFromEnd(listNode, 2);

        assert result.val == 1;
        assert result.next.val == 2;
        assert result.next.next.val == 3;
        assert result.next.next.next.val == 5;


        listNode = new ListNode(1);

        result = removeNthFromEnd.removeNthFromEnd(listNode, 1);
        assert result == null;

        listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        result = removeNthFromEnd.removeNthFromEnd(listNode, 1);
        assert result.val == 1;
        assert result.next == null;
    }
}
