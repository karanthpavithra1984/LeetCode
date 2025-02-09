package easy.LinkedList;

import easy.linkedList.GetDecimalValue;
import org.junit.Test;
import utils.ListNode;

public class GetDecimalValueTest {
    GetDecimalValue getDecimalValue = new GetDecimalValue();

    @Test
    public void testGetDecimalValue(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);

        assert getDecimalValue.getDecimalValue(listNode) == 5;

        listNode = new ListNode(0);

        assert getDecimalValue.getDecimalValue(listNode) == 0;
    }
}
