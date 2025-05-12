package easy.Stack;

import java.util.Stack;

public class MakeStringGreat {
    /**
     * Time Complexity o(n)
     * Space Complexity o(n) - the string is good :)
     *
     * @param s
     * @return
     */
    public String makeGood(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (!characterStack.isEmpty() && Math.abs(character - characterStack.peek()) == 32) {
                characterStack.pop();
            } else {
                characterStack.push(character);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : characterStack) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}
