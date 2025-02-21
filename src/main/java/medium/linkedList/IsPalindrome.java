package medium.linkedList;

import utils.ListNode;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        //First get the middle of the List
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the linked list
        ListNode temp = slow;
        ListNode reversed = null;
        while(temp != null) {
            ListNode next = temp.next;
            temp.next = reversed;
            reversed = temp;
            temp = next;
        }

        while(reversed != null && head != null) {
            if(head.val != reversed.val) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }
}
