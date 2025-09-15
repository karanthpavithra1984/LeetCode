package easy.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinLength {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('B', 'A');
        map.put('D', 'C');

        for (int i = 0; i < s.length(); i++) {
            boolean notFound = false;
            char c = s.charAt(i);
            if (!stack.isEmpty() && map.containsKey(c) && stack.peek() == map.get(c)) {
                notFound = true;
                stack.pop();
            }

            if (!notFound) {
                stack.push(c);
            }
        }

        return stack.size();
    }
}
