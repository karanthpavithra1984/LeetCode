package easy.Stack;

import java.util.Stack;

/**
 * Time Complexity - o(s + t)
 * Space Complexity - o(s + t)
 */

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '#') {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                }
            } else
                characterStack.add(character);
        }

        return String.valueOf(characterStack);
    }
}
