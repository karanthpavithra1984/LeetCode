package easy.LinkedList;

import easy.linkedList.RemoveLinkedListElements;
import org.junit.Test;
import utils.ListNode;

public class RemoveLinkedListElementsTest {
    RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    public void testRemoveLinkedListElements() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(6);
        listNode.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next = new ListNode(6);

        ListNode listNode1 = removeLinkedListElements.removeElements(listNode, 6);
        assert listNode1.val == 1;
        assert listNode1.next.val == 2;
        assert listNode1.next.next.val == 4;
        assert listNode1.next.next.next.val == 7;

        listNode = new ListNode(7);
        listNode.next = new ListNode(7);

        listNode1 = removeLinkedListElements.removeElements(listNode, 7);

        assert listNode1 == null;


    }
}
