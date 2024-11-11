package medium.Stack;

import java.util.Stack;

/**
 * Space is o(N) - Boolean and lastIndex are constant. FinalString at the max would be length of string , if there are no duplicates
 * Time Complexity o(2n)
 */

public class RemoveDuplicates {

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];

        //Keep track of last occurance of a character , this will
        for(int i = 0 ; i < s.length() ; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> finalString = new Stack<>();
        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);

            //Add the character to seen ,
            //If not in seen , then its a new character.
            //If not dont add it , as we dont want the duplicates
            if(!seen[ch - 'a']) {
                //if the previous character is greater than c and
                // if there is  another character at a later index lets use that. If not its safe to remove
                while (!finalString.isEmpty() && ch < finalString.peek() && i < lastIndex[finalString.peek() - 'a']) {
                        seen[finalString.peek() - 'a'] = false;
                        finalString.pop();
                }
                finalString.push(ch);
                seen[ch - 'a'] = true;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(Character c: finalString){
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
