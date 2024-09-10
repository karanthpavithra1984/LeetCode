package easy.linkedList;

import utils.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        ListNode currentNode = head;

        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = reversed;
            reversed = currentNode;
            currentNode = nextNode;
        }

        return reversed;
    }

}
