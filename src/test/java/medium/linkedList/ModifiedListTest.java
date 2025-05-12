package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class ModifiedListTest {
    ModifiedList modifiedList = new ModifiedList();

    @Test
    public void testModifiedList() {
        ListNode listNode = GeneralUtils.getListNode(new int[]{1, 2, 3, 4, 5});

        ListNode modList = modifiedList.modifiedList(new int[]{1, 2, 3}, listNode);

        GeneralUtils.validateListNode(modList, new int[]{4, 5});

        listNode = GeneralUtils.getListNode(new int[]{1, 2, 1, 2, 1, 2});

        modList = modifiedList.modifiedList(new int[]{1}, listNode);

        GeneralUtils.validateListNode(modList, new int[]{2, 2, 2});
    }

}
