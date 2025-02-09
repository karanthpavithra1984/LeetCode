package medium.Stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Time Complexity total o(3n) is o(n)
 * space complexity o(3n) - set , stack , stringbuilder space
 */

public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        Stack<Integer> pArray = new Stack<>();
        for(int i = 0 ; i< s.length(); i++){
            char paranthesis = s.charAt(i);
            if(paranthesis == '('){
                pArray.push(i);
            }else if(paranthesis == ')'){
                if(pArray.isEmpty()){
                    indexesToRemove.add(i);
                } else pArray.pop();
            }
        }


        while (!pArray.isEmpty()) indexesToRemove.add(pArray.pop());
        StringBuilder stringBuilder = new StringBuilder();

        for(int i= 0 ; i < s.length(); i++){
            if(!indexesToRemove.contains(i))
                stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}
