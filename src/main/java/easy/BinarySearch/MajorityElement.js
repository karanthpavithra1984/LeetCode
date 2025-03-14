var isMajorityElement = function(nums, target) {

    const lowerBound = (nums, target) => {
        let left = 0 , right = nums.length-1;
        let index = 0;
        while(left <= right){
            let middle = Math.floor((right+left)/2);

            if(nums[middle] >= target){
                right = middle-1;
                index = middle;
            }else{
                left = middle + 1;
            }
        }

        return index;
    }

    let firstIndex = lowerBound(nums, target);

    //First Index + nums.length/2 should be target as well
    if(nums[firstIndex + Math.floor(nums.length/2)] !=  target)
        return false;

    return true;
};