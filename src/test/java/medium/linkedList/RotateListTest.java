package medium.linkedList;

import org.junit.Test;
import utils.ListNode;


public class RotateListTest {

    RotateList rotateList = new RotateList();

    @Test
    public void testRotateList() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode rotateListNew = rotateList.rotateRight(listNode, 2);

        assert rotateListNew != null;
        assert rotateListNew.val == 4;
        assert rotateListNew.next.val == 5;
        assert rotateListNew.next.next.val == 1;
        assert rotateListNew.next.next.next.val == 2;
        assert rotateListNew.next.next.next.next.val == 3;
        assert rotateListNew.next.next.next.next.next == null;


        listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);

        rotateListNew = rotateList.rotateRight(listNode, 4);

        assert rotateListNew != null;
        assert rotateListNew.val == 2;
        assert rotateListNew.next.val == 0;
        assert rotateListNew.next.next.val == 1;
        assert rotateListNew.next.next.next == null;

        listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        rotateListNew = rotateList.rotateRight(listNode, 1);

        assert rotateListNew != null;
        assert rotateListNew.val == 2;
        assert rotateListNew.next.val == 1;
        assert rotateListNew.next.next == null;

    }
}
