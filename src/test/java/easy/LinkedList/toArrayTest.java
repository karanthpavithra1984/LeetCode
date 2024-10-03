package easy.LinkedList;

import easy.linkedList.toArray;
import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class toArrayTest {
    toArray toArray = new toArray();

    @Test
    public void testToArray(){
        ListNode node = GeneralUtils.getListNode(new int[]{1,2,3,4,3,2,1});

        int[] arr = toArray.toArray(node);

        assert arr.length == 7;
    }
}
