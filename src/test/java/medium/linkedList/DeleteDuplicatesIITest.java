package medium.linkedList;


import org.junit.Ignore;
import org.junit.Test;
import utils.ListNode;

import java.util.List;

public class DeleteDuplicatesIITest {
    DeleteDuplicatesII deleteDuplicatesII = new DeleteDuplicatesII();

    @Test
    public void testDeleteDuplicatesII() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);

        ListNode listNode1 = deleteDuplicatesII.deleteDuplicates(listNode);

        assert listNode1.val == 5;
        assert listNode1.next.val == 6;
    }

    @Test
    public void testDeleteDuplicatesII2() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);

        ListNode listNode2 = deleteDuplicatesII.deleteDuplicates(listNode);

        assert listNode2.val == 1;
        assert listNode2.next.val == 2;
        assert listNode2.next.next.val == 4;
        assert listNode2.next.next.next.val == 5;
    }

}
