package medium.linkedList;

import utils.ListNode;

public class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = list1;

        for(int i= 0  ; i < b; i++){
            if(i == a-1){
                start = end;
            }
            end = end.next;
        }
        ListNode listPointer = list2;
        start.next = list2;

        while(listPointer.next != null){
            listPointer = listPointer.next;
        }

        listPointer.next = end.next;

        return list1;
    }
}
