package medium.Stack;

import java.util.Stack;

public class RemoveKDigits {
    /**
     * Time Complexity o(n+k) worst case
     * Space Complexity o(n-k)
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        Stack<Character> characterStack = new Stack<>();
        /**
         * 1,4,3,2,2,1,9 , k =3
         * keep adding the characters to the stack, if the element is less than the last element pop it , until all the higher elements are gone
         *
         */
        for(Character character : num.toCharArray()){
            while(!characterStack.isEmpty() && k > 0 && characterStack.peek() > character){
                characterStack.pop();
                k--;
            }
            characterStack.push(character);
        }

        // After above operation , k = 0 , result is 1,2,1,9 - only 3 elements can be deleted hence 9 stays.

        //Below operation if there is one element or k is not 0 yet , then remove the trailing elements
        for(int i= 0 ; i< k; i++){
            characterStack.pop();
        }

        StringBuilder builder = new StringBuilder();

        //Build the string by removing the trailing spaces

        for(Character character: characterStack){
            if(builder.isEmpty() && character == '0')
                continue;
            builder.append(character);
        }

        return builder.isEmpty() ? "0" : builder.toString();
    }
}
