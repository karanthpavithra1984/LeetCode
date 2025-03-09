package hard.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * This is sort of a combination
 *
 * https://leetcode.com/problems/expression-add-operators/solutions/6391177/extremely-simple-with-comments-java-backtracking-solution/
 */

/**
 * Time Complexity 4^n
 * Space complexity 4^n for recursion and n for the adding to the result
 */

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<String>();

        backTrack(num, target, 0,  "", res,0, 0);

        return res;
    }

    private void backTrack(String num, int target,int index,  String path, List<String> res,long currentSum, long prevNum) {
        if(index == num.length()){
            if(currentSum == target){
                res.add(path);
            }
            return;
        }

        for(int i = index ;i < num.length();i++){

            //Make sure the leading 0s are not ingored
            //E.g if its [1,0,5]
            // If index = 1 , i = 2, the number substring below will be "05".
            //But when we do Long.parseLong, 0 will be ignored and it will be 5
            if(i != index && num.charAt(index) == '0'){
                break;
            }

            long number = Long.parseLong(num.substring(index, i+1));
            //No op
            if(index == 0){
                backTrack(num , target, i+1, path + number, res, number, number );
            }else{
                backTrack(num , target, i+1, path + "+"  + number, res, currentSum + number, number );
                backTrack(num , target, i+1, path + "-"  + number, res, currentSum - number, -number );
                backTrack(num , target, i+1, path + "*"  + number, res, currentSum-prevNum+(prevNum*number), prevNum*number );
            }
        }
    }

}
