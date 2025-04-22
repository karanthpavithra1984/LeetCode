package hard.linkedList;

import utils.ListNode;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        for(int i=1 ; i < lists.length; i++){
            lists[i] = mergeTwoLists(lists[i], lists[i-1]);
        }

        return lists[lists.length-1];
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode sentinel = new ListNode(-1);
        ListNode current = sentinel;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 =  list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }

        return sentinel.next;
    }
}
