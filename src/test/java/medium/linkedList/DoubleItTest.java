package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class DoubleItTest {

    DoubleIt doubleIt = new DoubleIt();

    @Test
    public void testDoubleIt() {
        ListNode listNode = GeneralUtils.getListNode(new int[]{1, 8, 9});

        GeneralUtils.validateListNode(doubleIt.doubleIt(listNode), new int[]{3, 7, 8});
        GeneralUtils.validateListNode(doubleIt.doubleIt(GeneralUtils.getListNode(new int[]{9, 9, 9})), new int[]{1, 9, 9, 8});
    }
}
