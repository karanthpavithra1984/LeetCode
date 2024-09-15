package easy.LinkedList;

import easy.linkedList.DeleteDuplicates;
import org.junit.Test;
import utils.ListNode;

public class DeleteDuplicatesTest {
    DeleteDuplicates deleteDuplicates = new DeleteDuplicates();

    @Test
    public void deleteDuplicates(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(5);

        ListNode dedupedNode = deleteDuplicates.deleteDuplicates(listNode);
        assert dedupedNode.val == 1;
        assert dedupedNode.next.val == 3;
        assert  dedupedNode.next.next.val == 5;
    }
}
