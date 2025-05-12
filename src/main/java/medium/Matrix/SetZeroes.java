package medium.Matrix;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {

        //Ideal solution would to use a List/Set get all the rows and cols which has 0
        //Iterate through them and if the row or col matches set it to 0;
        boolean fr = false;
        boolean fc = false;
        //For constant space use first row and column as the flag.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    //This gets tricky if the element is the corner case.
                    //There is no
                    if (i == 0) fr = true;
                    if (j == 0) fc = true;
                    //If a value is 0 , set the first element of the row and column as 0
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (fc) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
