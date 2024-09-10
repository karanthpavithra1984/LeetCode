package easy.linkedList;

import utils.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while(slowNode != null && fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if(slowNode == fastNode){
                return true;
            }
        }

        return false;
    }
}
