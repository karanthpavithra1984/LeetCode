package medium.linkedList;

import utils.ListNode;

public class SplitToParts {
    /**
     * Space Complexity - o(n)
     * Time Complexity - o(1) -     a`
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode tmp = head;

        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        int splitsize = size / k;
        int numOfRemainingElements = size % k;

        ListNode[] listNodes = new ListNode[k];
        tmp = head;
        ListNode prev = tmp;
        for (int i = 0; i < k; i++) {
            ListNode newPointer = tmp;
            int sizeOfArray = splitsize;
            if (numOfRemainingElements > 0) {
                numOfRemainingElements--;
                sizeOfArray++;
            }

            while (sizeOfArray > 0) {
                prev = tmp;
                tmp = tmp.next;
                sizeOfArray--;
            }

            if (prev != null) prev.next = null;

            listNodes[i] = newPointer;
        }


        return listNodes;
    }
}
