package medium.Stack;

import java.util.Stack;

public class MinAddToMakeValid {
    /**
     * Time Complexity o(n)
     * Space Complexity o(n)
     * @param s
     * @return
     */
    public int minAddToMakeValid(String s) {
        Stack<Character> paranth = new Stack<>();
        int numberRequired = 0;

        for(Character character: s.toCharArray()){
            if(character == '('){
                paranth.push(character);
            }else{
                if(paranth.isEmpty()){
                    numberRequired++;
                }else {
                    paranth.pop();
                }
            }
        }

        return numberRequired += paranth.size();
    }
}
