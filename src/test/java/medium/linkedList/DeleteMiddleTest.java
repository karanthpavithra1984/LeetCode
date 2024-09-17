package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class DeleteMiddleTest {

    DeleteMiddle deleteMiddle = new DeleteMiddle();

    @Test
    public void test() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);

        ListNode result = deleteMiddle.deleteMiddle(listNode);
        assert result != null;
        assert result.val == 1;
        assert result.next.val == 2;
        assert result.next.next.val == 3;
        assert result.next.next.next.val == 5;
        assert result.next.next.next.next.val == 6;
        assert result.next.next.next.next.next.val == 7;
    }
}
