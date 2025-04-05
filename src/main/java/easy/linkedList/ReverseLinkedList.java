package easy.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * Space Complexity o(1) - All the references are pointed to head
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        ListNode currentNode = head;

        while(currentNode != null){
            //Save the next Node
            ListNode nextNode = currentNode.next;
            //point currentNode to reverse
            currentNode.next = reversed;
            //Now the reversed is the currentNode
            reversed = currentNode;
            //CurrentNode is nextNode
            currentNode = nextNode;
        }

        return reversed;
    }

}
