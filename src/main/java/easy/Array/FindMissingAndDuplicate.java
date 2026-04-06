package easy.Array;

public class FindMissingAndDuplicate {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        boolean[] values = new boolean[grid.length * grid[0].length + 1];

        int currentSum = 0;
        int dup = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int j = 0; j < grid.length; j++) {
                int value = grid[r][j];
                if (values[value]) {
                    dup = value;
                } else {
                    currentSum += value;
                    values[value] = true;
                }
            }
        }

        int actualSum = (n * (n + 1)) / 2;
        return new int[] { dup, actualSum - currentSum };
    }
}
