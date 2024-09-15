package easy.LinkedList;

import easy.linkedList.LinkedListCycle;
import org.junit.Test;
import utils.ListNode;

public class LinkedListCycleTest {

    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void testLinkedListCycle() {
        ListNode loop = new ListNode(0);
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = loop;
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = loop;

        assert linkedListCycle.hasCycle(listNode);
    }
}
