package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class ReverseLinkedListTest {

    ReverseLinkedListII reverseLinkedList = new ReverseLinkedListII();

    @Test
    public void testReverseLinkedList() {
        ListNode listNode1 = GeneralUtils.getListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        reverseLinkedList.reverseBetween(listNode1, 2, 8);
    }
}
