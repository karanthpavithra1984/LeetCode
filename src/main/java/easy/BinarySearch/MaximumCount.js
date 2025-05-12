var maximumCount = function (nums) {
    const negativeIndex = function (nums) {
        let left = 0, right = nums.length - 1;
        let index = nums.length;
        while (left <= right) {
            let middle = Math.floor((left + right) / 2);
            if (nums[middle] < 0) {
                //Negative could be somewhere on the right
                left = middle + 1;
            } else if (nums[middle] >= 0) {
                right = middle - 1;
                index = middle;
            }
        }

        return index;
    }

    const positiveIndex = function (nums) {
        let left = 0, right = nums.length - 1;
        let index = nums.length;
        while (left <= right) {
            let middle = Math.floor((left + right) / 2);
            if (nums[middle] <= 0) {
                left = middle + 1;
            } else if (nums[middle] > 0) {
                right = middle - 1;
                index = middle;
            }
        }

        return index;
    }


    let positives = nums.length - positiveIndex(nums);
    let negatives = negativeIndex(nums);
    ;

    return Math.max(positives, negatives);

};