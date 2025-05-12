var getCommon = function (nums1, nums2) {
    let nums1Length = nums1.length;
    let num2Length = nums2.length;

    let left = 0, right = 0;

    while (left < nums1Length && right < num2Length) {
        if (nums1[left] < nums2[right]) {
            left++;
        } else if (nums1[left] > nums2[right]) {
            right++;
        } else {
            return nums1[left];
        }
    }

    return -1;
};