package medium.Stack;

import java.util.Stack;

/**
 * time Complexity o(n)
 * Space complexity o(1) - stack is cleared
 */

public class MinimumAddition {
    public int addMinimum(String word) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        //Add the first character
        stack.push(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            //If the next value is b or c
            int prev = stack.peek() - word.charAt(i);
            if (prev == -1 || prev == -2) { // b or c
                stack.push(word.charAt(i)); //add it to the stack.
            } else {
                sum = sum + (3 - stack.size());
                stack.clear();
                stack.push(word.charAt(i));
            }
        }

        sum = sum + (3 - stack.size());
        return sum;
    }
}
