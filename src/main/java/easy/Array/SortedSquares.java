package easy.Array;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int squareValue = 0;
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        while(left <= right && index >= 0) {
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                squareValue = nums[right] * nums[right];
                right--;
            }else{
                squareValue = nums[left] * nums[left];
                left++;
            }

            result[index] = squareValue;
            index--;
        }

        return result;
    }
}
