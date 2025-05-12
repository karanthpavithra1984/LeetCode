package medium.Stack;

import java.util.Stack;

/**
 * Time Complexity o(n)
 * Space Complexity o(1) , Stack is either empty or it will have some reminasence
 */

public class isValidString {

    public boolean isValid(String word) {

        Stack<Character> characterStack = new Stack<>();

        for (Character character : word.toCharArray()) {
            if (character == 'a' || character == 'b') {
                characterStack.push(character);
            } else {
                if (characterStack.isEmpty() || characterStack.size() == 1) return false;
                char isB = characterStack.pop();
                char isA = characterStack.pop();

                if (isB != 'b' || isA != 'a') {
                    return false;
                }
            }
        }

        return characterStack.isEmpty();

    }
}
