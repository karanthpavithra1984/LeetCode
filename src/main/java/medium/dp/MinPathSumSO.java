package medium.dp;

public class MinPathSumSO {
    public int minPathSum(int[][] grid) {
        Integer[] prevDp = new Integer[grid[0].length + 1];

        for (int r = grid.length - 1; r >= 0; r--) {
            Integer[] currentDp = new Integer[grid[0].length+1];
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if (prevDp[c] == null &&  currentDp[c+1] == null) {
                    currentDp[c] = grid[r][c];
                } else {
                    currentDp[c] = grid[r][c] + Math.min(currentDp[c + 1] == null ? Integer.MAX_VALUE : currentDp[c + 1],
                            prevDp[c] == null ? Integer.MAX_VALUE : prevDp[c]);
                }
            }
            prevDp = currentDp;
        }

        return prevDp[0];
    }
}
