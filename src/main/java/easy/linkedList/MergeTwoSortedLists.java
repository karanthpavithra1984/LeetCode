package easy.linkedList;

import utils.ListNode;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode mergedNode = new ListNode();
       ListNode referNode = mergedNode;


       while(list1 != null && list2 != null){
           if(list1.val <= list2.val){
               referNode.next = list1;
               list1 = list1.next;
           }else{
               referNode.next = list2;
               list2 = list2.next;
           }

           referNode = referNode.next;
       }

       referNode.next = list1 ==null ? list2: list1;
       return mergedNode.next;
    }
}
