let minimumDifference = function(nums, k) {
    nums.sort((a,b) => a-b);
    let count = Number.MAX_VALUE;
    let final = nums.length-k+1;
    for(let i=0; i < final ;i++){
        count = Math.min(count, nums[k+i-1]-nums[i]);
    }

    return count;
};