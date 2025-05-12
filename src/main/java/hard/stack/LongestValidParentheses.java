package hard.stack;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        //Combination of stack and sliding window
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(') {
                indexStack.push(i);
            } else {
                indexStack.pop();
                if (indexStack.empty()) {
                    indexStack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - indexStack.peek());
                }
            }
        }

        return maxLength;
    }
}
