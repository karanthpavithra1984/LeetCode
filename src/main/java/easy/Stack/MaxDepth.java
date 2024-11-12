package easy.Stack;

import java.util.Stack;

public class MaxDepth {
    /**
     * Time Complexity o(n)
     * Space complexity o(n/2) considering its a valid parenthiss string and all the opening will have closed brackets
     * @param s
     * @return
     */
    public int maxDepth(String s) {
        Stack<Character> characterStack = new Stack<>();
        int maxDepth = 0;
        for(Character character: s.toCharArray()){
            if(character == '('){
                characterStack.push(character);
            }else if(character == ')'){
                if(!characterStack.isEmpty()){
                    maxDepth = Math.max(maxDepth, characterStack.size());
                    characterStack.pop();
                }
            }
        }

        return maxDepth;
    }
}
