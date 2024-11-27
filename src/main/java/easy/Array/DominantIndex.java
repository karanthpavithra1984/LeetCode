package easy.Array;

public class DominantIndex {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;
        int prevMax = -1;

        //Maintain a prevMax and currentMax
        for (int i = 0; i < nums.length; i++) {
            //if number is greater than max
            //Then its going to be the nextMax, so save the prevMax.
            if (nums[i] > max) {
                prevMax = max;
            } else if (nums[i] > prevMax) { // if its greater than prevMax, then its the next best so save it as prevMax
                prevMax = nums[i];
            }
            max = Math.max(max, nums[i]);
            if (nums[i] == max && max >= 2 * prevMax) {
                index = i;
            }
        }

        if (prevMax != max && max < 2 * prevMax) {
            index = -1;
        }
        return index;
    }
}
