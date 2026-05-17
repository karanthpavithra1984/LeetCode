package easy.Array;

public class SpecialArray2 {
    public int specialArray(int[] nums) {
        int[] freq = new int[nums.length + 1];

        for (int num : nums) {
            //highest element/Last element in the array
            if (num >= nums.length) {
                freq[nums.length]++;
            } else {
                freq[num]++;
            }
        }

        //Prefix Sum
        int sum = 0;
        for (int i = nums.length; i >= 0; i--) {
            sum += freq[i];
            if (i == sum) {
                return i;
            }
        }

        return -1;
    }
}
