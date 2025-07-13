package medium.BinarySearch;

public class MissingElementsInSortedArray {
    public int missingElement(int[] nums, int k) {
        int left = 0 , right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            //Check if the number is in right
            if(nums[mid]- nums[0]-mid < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return nums[0]+k+right;
    }
}
