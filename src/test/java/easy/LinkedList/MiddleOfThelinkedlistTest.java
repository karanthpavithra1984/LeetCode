package easy.LinkedList;

import easy.linkedList.MiddleOfTheLinkedList;
import org.junit.Test;
import utils.ListNode;

public class MiddleOfThelinkedlistTest {

    MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    public void testMiddleOfTheLinkedList() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode middleNode = middleOfTheLinkedList.middleNode(listNode);

        assert middleNode != null;
        assert middleNode.val == 3;
    }
}
