package medium.Stack;

import java.util.Stack;

/**
 * Time Complexity o(n + m) - if all the elements could be popped
 * Space Complexity o(n) - only if all the elements cant be popped , in which case the time would be o(n)
 */

public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushedStack = new Stack<>();
        int i= 0;

        for(int push : pushed){
            pushedStack.push(push);
            while (!pushedStack.isEmpty() && i < popped.length && pushedStack.peek() == popped[i]){
                pushedStack.pop();
                i++;
            }
        }

        return i == popped.length;
    }
}
