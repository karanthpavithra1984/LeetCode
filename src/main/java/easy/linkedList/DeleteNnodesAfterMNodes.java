package easy.linkedList;

import utils.ListNode;

public class DeleteNnodesAfterMNodes {

    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     * @param head
     * @param m
     * @param n
     * @return
     */

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode lastNode = head;

        while(currentNode != null){
            int tempMCount = m;
            int tempNCount = n;

            while(currentNode != null && tempMCount > 0){
                lastNode = currentNode;
                currentNode = currentNode.next;
                tempMCount--;
            }

            while (currentNode != null && tempNCount > 0){
                currentNode = currentNode.next;
                tempNCount--;
            }

            lastNode.next = currentNode;
        }

        return head;
    }
}
