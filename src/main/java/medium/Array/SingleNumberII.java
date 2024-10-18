package medium.Array;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int seenOnce = 0, seenTwice = 0;
        for(int num: nums ){
            seenOnce = (seenOnce ^ num) & (~seenTwice);
            seenTwice = (seenTwice ^ num) & (~seenOnce);
        }

        return seenOnce;
    }
}
