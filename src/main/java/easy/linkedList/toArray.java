package easy.linkedList;

import utils.ListNode;

import java.util.Arrays;

/**
 * Time Complexity o(N)
 * space complexity o(1)
 */
public class toArray {
    public int[] toArray(ListNode head) {
        ListNode temp = head;
        int size = 0;

        int[] array = new int[50];
        while (temp != null){
            array[size] = temp.val;
            temp = temp.next;
            size++;
        }

        return Arrays.copyOf(array,size);
    }
}
