package medium.dp;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] prevRow = new int[n];

        for(int r=m-1; r>=0;r--){
            int[] curRow = new int[n];
            curRow[n-1] = 1; //To reach the path u need 1;
            for(int c=n-2; c>=0; c--){
                curRow[c] = curRow[c+1] + prevRow[c];
            }
            prevRow= curRow;
        }

        return prevRow[0];
    }
}
