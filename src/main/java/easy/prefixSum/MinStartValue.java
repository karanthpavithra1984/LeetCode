package easy.prefixSum;

public class MinStartValue {
    /**
     *  nums = [-3,2,-3,4,2]
     *  so the prefix sums would be [-3,-1,-4,0,2]
     *  what x should be added to each prefix sum , such that its not less than 0
     *  the minimum value is -4 , for it to be 1 , x should be 5
     *  So calculate the minimum value and then multiply by minValue + 1;
     *
     * Time Complexity - o(n)
     * Space Complexity - o(1)
     * @param nums
     * @return
     */
    public int minStartValue(int[] nums) {
        int total = 0;
        int minValue = 0;

        for(int num: nums){
            total += num;
            minValue = Math.min(total, minValue);
        }

        return -minValue + 1;
    }

}
