package easy.twopointers;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
       int left =0 , right = nums.length - 1;

       while(left < right) {
           if(nums[right] % 2 == 0) {
               while (left < nums.length - 1 && left < right  && nums[left] % 2 == 0) {
                   left++;
               }
               int temp = nums[left];
               nums[left] = nums[right];
               nums[right] = temp;
           }
           right--;
       }

       return nums;
    }
}
