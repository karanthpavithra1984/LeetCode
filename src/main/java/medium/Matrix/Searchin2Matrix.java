package medium.Matrix;

public class Searchin2Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Simple is looping through the matrix and checking for the target.
        //If the value is target, return
        //Time o(n*m) and space 1

        //Considering the matrix is sorted, its possible to come up with a better solution
        //You can start at the corners i.e bottom or right i.e diagonal corners

        int col = matrix[0].length - 1;
        int row = 0;

        //We are only increasing row and col - so row + col

        while (col >= 0 && row < matrix.length) {
            if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                return true;
            }
        }

        return false;
    }
}
