package medium.dp;

public class MaximumLengthSubArray {
    public int findLength(int[] nums1, int[] nums2) {
        int[] prevDp = new int[nums2.length + 1];
        int max = 0;

        for (int i = 0; i < nums1.length; i++) {
            int[] currDp = new int[nums2.length + 1];
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    currDp[j + 1] = prevDp[j] + 1;
                    max = Math.max(max, currDp[j + 1]);
                }
            }

            prevDp = currDp;
        }

        return max;
    }
}
