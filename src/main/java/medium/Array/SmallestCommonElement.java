package medium.Array;

import java.util.Arrays;

public class SmallestCommonElement {
    public int smallestCommonElement(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) {
            boolean found = true;
            //Do a binary search of each element from the first row in every other row
            for (int i = 1; i < rows && found; i++) {
                found = Arrays.binarySearch(mat[i], mat[0][j]) >= 0;
            }

            if (found) {
                return mat[0][j];
            }
        }

        return -1;
    }
}
