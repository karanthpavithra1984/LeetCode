package medium.Matrix;

import utils.ListNode;

import java.util.Arrays;

public class SpiralMatrixIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(res[i], -1);
        }

        int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        int row = 0, col = 0;
        int direction = 0;
        while (head != null) {
            res[row][col] = head.val;

            int newRow = row + directions[direction][0];
            int newCol = col + directions[direction][1];

            //Hit the edges and column is already populatec
            if (newRow >= m || newCol >= n || newRow < 0 || newCol < 0 || res[newRow][newCol] != -1) {
                direction = (direction + 1) % 4;
            }

            row += directions[direction][0];
            col += directions[direction][1];
            head = head.next;
        }

        return res;
    }
}
