package easy.LinkedList;

import easy.linkedList.LinkedListFrequency;
import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class LinkedListFrequencyTest {
    LinkedListFrequency linkedListFrequency = new LinkedListFrequency();

    @Test
    public void testLinkedListFrequency() {
        ListNode listNode = GeneralUtils.getListNode(new int[]{1, 1, 2, 1, 2, 3});
        ListNode listNode1 = linkedListFrequency.frequenciesOfElements(listNode);

        assert listNode1.val == 3;
        assert listNode1.next.val == 2;
        assert listNode1.next.next.val == 1;

        listNode = GeneralUtils.getListNode(new int[]{1, 1, 2, 2, 2});
        ListNode listNode2 = linkedListFrequency.frequenciesOfElements(listNode);

        assert listNode2.val == 2;
        assert listNode2.next.val == 3;
    }
}
