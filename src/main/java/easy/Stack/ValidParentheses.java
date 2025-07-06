package easy.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put(')', '(');
        characterMap.put('}', '{');
        characterMap.put(']', '[');

        Stack<Character> characterStack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (characterMap.containsKey(character)) {
                if (characterStack.isEmpty()) {
                    return false;
                }

                if (characterStack.peek().equals(characterMap.get(character))) {
                    characterStack.pop();
                } else {
                    return false;
                }

            } else {
                characterStack.push(character);
            }
        }

        return characterStack.isEmpty();
    }
}
