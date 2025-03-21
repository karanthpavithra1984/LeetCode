let nextGreatestLetter = function (letters, target) {
    let left = 0, right = letters.length - 1;
    let index = 0;
    while (left <= right) {
        let middle = Math.floor((left + right) / 2);

        if (letters[middle] <= target) {
            left = middle + 1;
        } else {
            index = middle;
            right = middle - 1;
        }
    }

    return letters[index];
};