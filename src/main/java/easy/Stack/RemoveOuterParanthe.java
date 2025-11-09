package easy.Stack;

import java.util.Stack;

public class RemoveOuterParanthe {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();

        for(char c:charArray){
            if(c=='('){
                if(!stack.isEmpty()){
                    stringBuilder.append("(");
                }
                stack.push(c);
            }else {
                stack.pop();
               if(!stack.isEmpty()){
                   stringBuilder.append(")");
               }
            }
        }

        return stringBuilder.toString();
    }
}
