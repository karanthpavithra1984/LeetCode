package medium.Stack;

import java.util.Stack;

public class ResultingString {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() &&
                    (Math.abs(c - stack.peek()) == 1 || Math.abs(c - stack.peek()) == 25) ) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
