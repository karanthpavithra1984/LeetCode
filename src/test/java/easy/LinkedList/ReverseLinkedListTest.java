package easy.LinkedList;

import easy.linkedList.ReverseLinkedList;
import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    @Test
    public void testReverseLinkedList(){
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        listNode1.next.next.next.next = new ListNode(5);

        ListNode reverseList = reverseLinkedList.reverseList(listNode1);
        assert reverseList.val == 5;
        assert reverseList.next.val == 4;
        assert reverseList.next.next.val == 3;
        assert reverseList.next.next.next.val == 2;
        assert reverseList.next.next.next.next.val == 1;


        GeneralUtils.validateListNode(reverseLinkedList.reverseList(GeneralUtils.getListNode(new int[]{7,3,4,8})) ,  new int[]{8,4,3,7});

    }
}
