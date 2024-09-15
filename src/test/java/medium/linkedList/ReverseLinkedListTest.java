package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class ReverseLinkedListTest {

    ReverseLinkedListII reverseLinkedList = new ReverseLinkedListII();

    @Test
    public void testReverseLinkedList(){
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        listNode1.next.next.next.next = new ListNode(5);

        reverseLinkedList.reverseBetween(listNode1, 2, 4);
    }
}
