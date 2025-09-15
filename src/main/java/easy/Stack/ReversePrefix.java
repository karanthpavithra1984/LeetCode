package easy.Stack;

import java.util.Stack;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            if (ch == stack.peek()) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return word;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.append(word.substring(index + 1));

        return sb.toString();
    }
}
