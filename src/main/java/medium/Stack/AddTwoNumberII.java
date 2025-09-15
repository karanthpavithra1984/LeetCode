package medium.Stack;

import utils.ListNode;

import java.util.Stack;

public class AddTwoNumberII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

        Stack<Integer> output = new Stack<>();

        int carry = 0;

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            int num1 = stack1.isEmpty() ? 0 : stack1.pop();
            int num2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum %= 10;

            output.push(sum);
        }

        if(carry > 0){
            output.push(carry);
        }

        ListNode head = new ListNode();
        ListNode outputNode = head;
        while(!output.isEmpty()){
            outputNode.next = new ListNode(output.pop());
            outputNode = outputNode.next;
        }

        return head.next;
    }
}
