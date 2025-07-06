package medium.Matrix;

public class IslandPerimeter {
    private final int PERIMETER_OF_SQUARE = 4;
    private int ROW;
    private int COL;
    private int currPerimeter;

    public int islandPerimeter(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        int total = 0;

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                if (grid[row][col] == 1) {
                    currPerimeter = PERIMETER_OF_SQUARE;

                    int[][] neighbors = new int[][]{{row, col + 1}, {row + 1, col}, {row, col - 1}, {row - 1, col}};
                    for (int i = 0; i < neighbors.length; i++) {
                        int newRow = neighbors[i][0];
                        int newCol = neighbors[i][1];
                        if (newRow < 0 || newRow >= ROW || newCol < 0 || newCol >= COL) {
                            continue;
                        }
                        if (grid[newRow][newCol] == 1) {
                            currPerimeter -= 1;
                        }
                    }
                    total += currPerimeter;
                }


            }
        }

        return total;
    }

}
