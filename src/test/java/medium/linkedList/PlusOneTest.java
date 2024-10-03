package medium.linkedList;

import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;


public class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void testPlusOne(){
        ListNode listNode = GeneralUtils.getListNode(new int[]{1,2,3});

        ListNode newNode = plusOne.plusOne(listNode);

        assert newNode != null;
        assert newNode.val == 1;
        assert newNode.next.val == 2;
        assert newNode.next.next.val == 4;

        listNode = GeneralUtils.getListNode(new int[]{0});

        newNode = plusOne.plusOne(listNode);

        assert newNode != null;
        assert newNode.val == 1;
        assert newNode.next == null;

        listNode = GeneralUtils.getListNode(new int[]{9});

        newNode = plusOne.plusOne(listNode);

        assert newNode.val == 1;
        assert newNode.next != null;
        assert newNode.next.val == 0;

        listNode = GeneralUtils.getListNode(new int[]{1,9,9});

        newNode = plusOne.plusOne(listNode);

        assert newNode.val == 2;
        assert newNode.next != null;
        assert newNode.next.val == 0;
        assert newNode.next.next.val == 0;


    }
}
