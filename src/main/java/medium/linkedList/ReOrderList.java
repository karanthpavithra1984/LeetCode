package medium.linkedList;

import utils.ListNode;

public class ReOrderList {
    public void reorderList(ListNode head) {
        //Get the middle first
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Slow is the middle.
        //Now reverse from the middle
        ListNode currentNode = slow;
        ListNode prev = null;
        while(currentNode != null){
            ListNode temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        }

        System.out.println("here");

        ///Prev is the reverse
        //Now merge current and prev
        ListNode first = head;
        ListNode second = prev;

        while(second.next != null){
            ListNode temp1 =  first.next;
            first.next = second;
            first = temp1;

            ListNode temp2 = second.next;
            second.next = temp1;
            second = temp2;
        }
    }
}
