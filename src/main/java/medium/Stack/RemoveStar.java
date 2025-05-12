package medium.Stack;

import java.util.Stack;

public class RemoveStar {
    public String removeStars(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (!characterStack.isEmpty() && character == '*') {
                characterStack.pop();
            } else characterStack.push(character);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : characterStack) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}
