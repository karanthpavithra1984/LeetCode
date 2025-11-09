package medium.Stack;

import java.util.Stack;

public class ValidString {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == '*') {
                stack2.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!stack2.isEmpty()) {
                    stack2.pop();
                } else {
                    return false;
                }
            }
        }

        while (!stack.isEmpty() && !stack2.isEmpty()) {
            if (stack.pop() > stack2.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
