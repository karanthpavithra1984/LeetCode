var searchInsert = function (nums, target) {
    let left = 0, right = nums.length - 1;

    while (left <= right) {
        let middle = Math.floor((right + left) / 2);
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
    }

    return left;
};