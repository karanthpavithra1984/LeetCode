package medium.linkedList;

import utils.ListNode;

/**
 * Time Complexity - You go through the list thrice, two reverse and one to double the value. So 3(n)
 * Space Complexity - o(1) , you are not creating new nodes.
 */

public class DoubleIt {
    public ListNode doubleIt(ListNode head) {
        ListNode reverseList = reverseList(head);
        ListNode doubleList = reverseList;
        int carry = 0;

        while(doubleList != null ){
            int doubledValue = doubleList.val * 2;
            int sum = (doubledValue) % 10 + carry;
            carry = doubledValue / 10;
            doubleList.val = sum;
            doubleList = doubleList.next;
        }


        ListNode reverseAgain =  reverseList(reverseList);
        return carry > 0 ? new ListNode(carry, reverseAgain) : reverseAgain;
    }

    private ListNode reverseList(ListNode head){
        ListNode tmp = head;
        ListNode reversed = null;

        while(tmp != null){
            ListNode nextNode = tmp.next;
            tmp.next = reversed;
            reversed = tmp;
            tmp = nextNode;
        }

        return reversed;
    }
}
