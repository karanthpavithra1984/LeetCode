package medium.Matrix;

import java.util.Arrays;

public class MatrixSum {
    public int matrixSum(int[][] nums) {

        int R = nums.length, C = nums[0].length;

        //Sort the rows
        for (int i = 0; i < R; i++) {
            Arrays.sort(nums[i]);
        }

        int total = 0;
        for (int i = 0; i < C; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < R; j++) {
                max = Math.max(max, nums[j][i]);
            }

            total += max;
        }

        return total;
    }
}
