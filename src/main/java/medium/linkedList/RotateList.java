package medium.linkedList;

import utils.ListNode;

public class RotateList {

    /**
     * Time Complexity - o(n)
     * Space Complexity - o(1)
     * @param head
     * @param k
     * @return
     */

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null || k == 0) return head;
        int length = 1;

        ListNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
            length++;
        }

        //Calculate effective rotations
        int numOfRotations = k%length;

        if(numOfRotations == 0) return head;

        //Circular here - end of temp is connected to head
        temp.next = head;

       while (numOfRotations > -1) {
           temp = temp.next;
           numOfRotations--;
       }



       //The item before the head
       head = temp.next;
       //Connect the item to null and make it a tail
       temp.next = null;


       return head;
    }
}
