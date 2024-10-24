package easy.prefixSum;

/**
 * Time Complexity o(2n)
 * Space Complexity o(1)
 */
public class MaxSplitStringScore {
    public int maxScore(String s) {
        int ones = 0;
        //Calculate 1s
        for(char c: s.toCharArray()){
            if(c == '1') ones++;
        }

        int zeros = 0;
        int best = -1;
        //Go through it again where if the character is 0 then calculate 0
        //But if its 1 , then decrease from ones and check the sum of zeros and ones to see if its the best value.
        //Non empty subarray
        for(int i = 0 ;i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zeros++;
            }else{
                ones--;
            }

            best = Math.max(best, zeros + ones);
        }

        return best;
    }
}
