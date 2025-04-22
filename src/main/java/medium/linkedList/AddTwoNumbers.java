package medium.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(max(size of l1 , size of l2)
 * Space Complexity - o(max(size of l1 , size of l2) - SumNode is a new node
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode sentinnel = new ListNode(-1);
       ListNode sumNode = sentinnel;

       int carry  = 0;
       while(l1 != null || l2 != null || carry != 0){
           int l1Val = l1 == null ? 0 : l1.val;
           int l2Val = l2 == null? 0 : l2.val;
           int sum = l1Val + l2Val + carry;
           sumNode.next = new ListNode(sum % 10);
           carry = sum/10;
           sumNode = sumNode.next;
           l1 = l1 != null ? l1.next : null;
           l2 = l2 != null? l2.next: null;
       }


       return sentinnel.next;
    }
}
