package medium.BinarySearch;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length) {
            System.out.println(row + "," + col);
            if (matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}
