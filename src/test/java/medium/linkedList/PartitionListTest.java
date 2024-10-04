package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class PartitionListTest {
    PartitionList partitionList = new PartitionList();

    @Test
    public void testPartitionList(){
        ListNode listNode = partitionList.partition(GeneralUtils.getListNode(new int[]{1,4,3,2,5,2}),3);

        GeneralUtils.validateListNode(listNode, new int[]{1,2,2,4,3,5});

        listNode = partitionList.partition(GeneralUtils.getListNode(new int[]{2,1}),2);

        GeneralUtils.validateListNode(listNode, new int[]{1,2});
    }
}
