package easy.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(-1); //Sentinel Node
        ListNode prevNode = newNode;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                prevNode.next = list1;
                list1 = list1.next;
            }else{
                prevNode.next = list2;
                list2 = list2.next;
            }
            prevNode = prevNode.next;
        }
        prevNode.next = list1 == null ? list2: list1;

        return newNode;
    }
}
