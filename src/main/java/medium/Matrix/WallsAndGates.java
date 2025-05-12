package medium.Matrix;

public class WallsAndGates {
    private static int ROWS;
    private static int COLS;

    public void wallsAndGates(int[][] rooms) {
        ROWS = rooms.length;
        COLS = rooms[0].length;

        //lets start with the gate and do a  DFS from there
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                //This is a gate
                if (rooms[row][col] == 0) {
                    dfs(rooms, row, col, 0);
                }
            }
        }
    }

    private void dfs(int[][] rooms, int row, int col, int distance) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || rooms[row][col] == -1 ||
                (distance != 0 && rooms[row][col] <= distance)) { //If its not a gate and if the distance is already calculated and is less than the distance, dont recalcualte
            return; //Just the usual conditions to not go out of the matrix table
        }

        rooms[row][col] = distance;
        dfs(rooms, row - 1, col, distance + 1);
        dfs(rooms, row + 1, col, distance + 1);
        dfs(rooms, row, col - 1, distance + 1);
        dfs(rooms, row, col + 1, distance + 1);
    }
}
