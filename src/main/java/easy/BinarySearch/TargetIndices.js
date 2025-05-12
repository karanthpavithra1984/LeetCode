var targetIndices = function (nums, target) {
    let countTarget = 0;
    let lessIndex = 0;
    for (let num of nums) {
        //Number of Indexes which are lower than target
        if (num < target) lessIndex++
        if (num == target) countTarget++;
    }

    let result = new Array();
    while (countTarget > 0) {
        result.push(lessIndex++);
        countTarget--;
    }

    return result;
};