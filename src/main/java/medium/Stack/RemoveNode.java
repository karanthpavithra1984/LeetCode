package medium.Stack;

import utils.ListNode;

import java.util.Stack;

public class RemoveNode {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.push(head.val);
            head = head.next;
        }

        int maximum = stack.pop();
        ListNode result = new ListNode(maximum);
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(current < maximum){
                continue; //Dont do anything
            }else{ //Add to the listnode
                ListNode temp = new ListNode(current);
                temp.next = result;
                result = temp;
                maximum = current;
            }
        }

        return result;
    }

}
