package easy.LinkedList;

import easy.linkedList.IntersectionOfTwoLinkedLists;
import org.junit.Test;
import utils.ListNode;

public class IntersectionOfTwoLinkedListsTest {
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

    @Test
    public void testIntersectionOfTwoLinkedLists() {
        ListNode mergedNode = new ListNode(4);
        mergedNode.next = new ListNode(5);


        ListNode listNodeA = new ListNode(1);
        listNodeA.next = new ListNode(2);
        listNodeA.next.next = new ListNode(3);
        listNodeA.next.next.next = mergedNode;


        ListNode listNodeB = new ListNode(7);
        listNodeB.next = new ListNode(8);
        listNodeB.next.next = mergedNode;

        ListNode resultNode = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

        assert resultNode.val == 4;

    }
}
