package easy.LinkedList;

import easy.linkedList.MergeTwoSortedLists;
import org.junit.Test;
import utils.ListNode;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void testMergeSortedLists() {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(2);
        listNode2.next.next = new ListNode(4);

        ListNode mergedTwoSorted = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

        assert mergedTwoSorted != null;
        assert mergedTwoSorted.val == 1;
        assert mergedTwoSorted.next.val == 1;
        assert mergedTwoSorted.next.next.val == 2;
        assert mergedTwoSorted.next.next.next.val == 2;
        assert mergedTwoSorted.next.next.next.next.val == 3;
        assert mergedTwoSorted.next.next.next.next.next.val == 4;
    }
}
