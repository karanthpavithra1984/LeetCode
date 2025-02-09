package easy.SlidingWindow;

public class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
        //Sliding Window approach might work for this
        int left = 0, right = 0;
        int numOfFlips = 0;
        int minFlips = Integer.MAX_VALUE;
        //WBWBBBW & k =2
        //Edge cases , what if the length of string is same as the K
        //What if the W is towards the end of the k range, and doesnt get to have a Min

        while(left <= right && right < blocks.length()) {
            if(right - left >= k){
                minFlips = Math.min(minFlips, numOfFlips);
                if(blocks.charAt(left) == 'W'){
                    numOfFlips--;
                }
                left++;
            }
            if(blocks.charAt(right) == 'W') {
                numOfFlips++;
            }
            right++;
        }

        return minFlips == Integer.MAX_VALUE ? numOfFlips  : Math.min(minFlips, numOfFlips);
    }
}
