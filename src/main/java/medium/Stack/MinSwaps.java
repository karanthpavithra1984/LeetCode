package medium.Stack;

import java.util.Stack;

public class MinSwaps {
    public int minSwaps(String s) {
        Stack<Character> characterStack = new Stack<>();
        int unbalanced = 0;

        for (Character character : s.toCharArray()) {
            if (character == '[') {
                characterStack.push(character);
            } else {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                } else {
                    unbalanced++;
                }
            }
        }

        return (unbalanced + 1) / 2;
    }
}
