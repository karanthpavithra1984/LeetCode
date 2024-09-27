package easy.LinkedList;

import easy.linkedList.DeleteNnodesAfterMNodes;
import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

import static org.junit.Assert.assertTrue;

public class DeleteNnodesAfterMNodesTest {

    DeleteNnodesAfterMNodes deleteNnodesAfterMNodes = new DeleteNnodesAfterMNodes();

    @Test
    public void testDeleteNNodesAfterMNodes(){
        ListNode listNode = GeneralUtils.getListNode(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13} );

        ListNode updatedList = deleteNnodesAfterMNodes.deleteNodes(listNode, 2, 3);

        assertTrue(GeneralUtils.validateList(updatedList, new int[]{1,2,6,7,11,12}));

        listNode = GeneralUtils.getListNode(new int[]{1,2,3,4,5,6,7,8,9,10,11});

        updatedList = deleteNnodesAfterMNodes.deleteNodes(listNode, 1, 3);

        assertTrue(GeneralUtils.validateList(updatedList, new int[]{1,5,9}));
    }
}
