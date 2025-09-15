package medium.Stack;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextLargerNode {
    public int[] nextLargerNodes(ListNode head) {
        Stack<int[]> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            list.add(0);
            while (!stack.isEmpty() && cur.val > stack.peek()[1]) {
                int[] curr = stack.pop();
                int idx = curr[0];
                list.set(idx, cur.val);
            }
            stack.push(new int[] { index++, cur.val });

            cur = cur.next;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
