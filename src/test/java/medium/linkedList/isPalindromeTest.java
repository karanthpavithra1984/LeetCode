package medium.linkedList;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.assertFalse;

public class isPalindromeTest {
    IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(isPalindrome.isPalindrome(head));
    }
}
