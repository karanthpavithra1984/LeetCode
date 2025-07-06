package medium.Matrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakingALargeIsland {
    private static final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int ROW;
    private int COL;

    public int largestIsland(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        int islandId = 2; //Because islands are 1

        //First lets run dfs and get the sizes of the islands
        Map<Integer, Integer> islandIdSizeMap = new HashMap<>();

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(grid, i, j, islandId);
                    islandIdSizeMap.put(islandId, islandIdSizeMap.getOrDefault(islandId, 0) + size);
                }

                islandId++;
            }
        }

        if (islandIdSizeMap.size() == 0) {
            return 1;
        }
        //With whatever we have this is the maxIsland
        int maxIsland = islandIdSizeMap.values().stream().mapToInt(i -> i).max().getAsInt();

        //Now go though each 0 and look for islands around and calculate the totalSize

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> connectedIslands = new HashSet<>();
                    for (int[] direction : directions) {
                        int newRow = i + direction[0];
                        int newCol = j + direction[1];
                        //IslandId starts with 2;
                        if (newRow < 0 || newCol < 0 || newRow >= ROW || newCol >= COL || grid[newRow][newCol] < 2) {
                            continue;
                        }

                        connectedIslands.add(grid[newRow][newCol]);
                    }

                    //Once u got all ConnectedIslands. Get the total size
                    int sizeofTheIsland = 1;
                    for (Integer id : connectedIslands) {
                        sizeofTheIsland += islandIdSizeMap.get(id);
                    }

                    maxIsland = Math.max(maxIsland, sizeofTheIsland);
                }
            }
        }

        return maxIsland;
    }

    private int dfs(int[][] grid, int row, int col, int isLandId) {
        if (row >= ROW || row < 0 || col >= COL || col < 0 || grid[row][col] != 1) {
            return 0;
        }

        grid[row][col] = isLandId;

        int size = 1;


        for (int[] direction : directions) {
            size += dfs(grid, row + direction[0], col + direction[1], isLandId);
        }

        return size;
    }
}
