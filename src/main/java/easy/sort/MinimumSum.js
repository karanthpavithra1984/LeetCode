var minimumSum = function (num) {
    let sortedNum = num.toString().split("").sort();

    return parseInt(sortedNum[0] + sortedNum[2]) +
        parseInt(sortedNum[1] + sortedNum[3]);
};