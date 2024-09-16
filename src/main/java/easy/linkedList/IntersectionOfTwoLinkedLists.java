package easy.linkedList;

import utils.ListNode;

public class IntersectionOfTwoLinkedLists {

    /**
     * Time Complexity, o(N) might have to go over the object twice to reach intersection
     * Space Complexity - o(1) - we are just moving the pointers
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pntA = headA;
        ListNode pntB = headB;

        while (pntA != pntB) {
            pntA = pntA == null ? headB : pntA.next;
            pntB = pntB == null ? headA : pntB.next;
        }

        return pntA;
    }
}
