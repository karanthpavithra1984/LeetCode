package medium.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class LengthOfIncreasingSubSequence {
    public int lengthOfLIS(int[] nums) {
        //You can use brute force
        //If the next number is greater than last in the array , then add it
        //If not , start from the beginning and insert the element by replacing the number
        //Which is greater than current Number

        // But we can leverage the binary search here, since the number in the list is already
        //In the sorting order

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(nums[0]); //Add first element

        for(int i =1 ; i < nums.length; i++){
            if(nums[i] > numList.get(numList.size()-1)){
                numList.add(nums[i]); //If the number is greater add it.
            }else{
                //Find the index of the first number which is greater than the currentNumber
                int j = binarySearch(numList, nums[i]);
                numList.set(j, nums[i]);
            }
        }

        return numList.size();
    }

    private int binarySearch(List<Integer> nums, int target){
        int left = 0;
        int right = nums.size() - 1;


        while(left < right){
            int mid = left + (right - left) / 2;
            int midValue = nums.get(mid);

            if(midValue == target){
                return mid;
            }

            if(target > midValue){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        return left;
    }

}
