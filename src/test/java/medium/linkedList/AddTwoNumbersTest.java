package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void testAddTwoNumbers1(){
        ListNode listNode1 = new ListNode(2);
        listNode1.next  = new ListNode(3);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(7);

        ListNode addedNodes = addTwoNumbers.addTwoNumbers(listNode1, listNode2);
        assert  addedNodes.val == 7;
        assert  addedNodes.next.val == 9;
        assert  addedNodes.next.next.val == 1;
        assert  addedNodes.next.next.next.val == 1;
    }

    @Test
    public void testAddTwoNumbers2(){
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);
        listNode1.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next = new ListNode(9);


        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        listNode2.next.next.next.next = new ListNode(9);

        ListNode addedNodes = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        assert  addedNodes.val == 8;
        assert  addedNodes.next.val == 9;
        assert  addedNodes.next.next.val == 9;

    }
}
