package medium.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 *
 * Create two nodes one left and right and merge them
 */

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode leftNode = new ListNode(0, head);
        ListNode tmpLeftNode = leftNode;
        ListNode rightNode = new ListNode(0, head);
        ListNode tmpRightNode = rightNode;

        while(head != null){
            if(head.val < x){
                tmpLeftNode.next = head;
                tmpLeftNode = tmpLeftNode.next;
            }else{
                tmpRightNode.next = head;
                tmpRightNode = tmpRightNode.next;
            }

            head = head.next;
        }
        tmpRightNode.next = null;

        tmpLeftNode.next = rightNode.next;

        return leftNode.next;
    }
}
