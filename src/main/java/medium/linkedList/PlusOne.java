package medium.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 *
 */
public class PlusOne {
    public ListNode plusOne(ListNode head) {
       ListNode sentinel = new ListNode(0, head);
       ListNode notNine = sentinel;

       while (head != null){
           if(head.val != 9){
               notNine = head;
           }
           head = head.next;
       }

       notNine.val++;

       if(notNine.next == null){
           return sentinel.next;
       }

       while (notNine.next != null){
           notNine = notNine.next;
           notNine.val = 0;
       }

       return sentinel.val == 0 ? sentinel.next : sentinel;


    }
}
