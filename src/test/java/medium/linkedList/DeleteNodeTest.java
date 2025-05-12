package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class DeleteNodeTest {
    DeleteNode deleteNode = new DeleteNode();

    @Test
    public void testDeleteNode() {
        ListNode listNode = GeneralUtils.getListNode(new int[]{1, 5, 1, 2});
        ListNode tmp = listNode;
        tmp = tmp.next;

        deleteNode.deleteNode(tmp);

        GeneralUtils.validateListNode(listNode, new int[]{1, 1, 2});
    }
}
