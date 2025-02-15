package medium.dp;

public class MaximumLengthOfSubArray {
    //Time complexity o(n)
    //Space o(1)
    public int getMaxLen(int[] nums) {
        //Keep track of positive and negative
        int positive = 0;
        int negative = 0;
        int ans = 0;

        for(int n: nums){
            if(n == 0){
                positive = 0;
                negative = 0; //reset both
            }else if(n > 0){
                //Definetly increase positive
                positive++;
                //If there is a negative number , also increase that.
                // Suppose array is -1,2,3 , the subarray product is already negaitve
                if(negative != 0 ){
                    negative++;
                }
            }else{
                //A negative number has encounterd.
               //You will have to swap positive with negative
                int temp = positive;
                //there were no negative , reset positive
                // else negative is new positive
                positive = negative == 0? 0 : negative + 1;
                negative = temp + 1;
            }

            //We only need positive
            ans = Math.max(ans, positive);
        }

        return ans;
    }
}
