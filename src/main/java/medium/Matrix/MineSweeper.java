package medium.Matrix;

public class MineSweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        //If a mine M is revealed , then the game is over
        if(board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        traverse(board, click);

        return board;
    }

    private void traverse(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        //Only In border row and column and Non Empty cells are being worked ON
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'E') {
            return;
        }

        //Include diagonals
        board[row][col] = '0';
        int[][] neighbors = new int[][]{{row, col-1},{row, col+1}, {row-1, col}, {row+1, col}, {row-1, col-1},{row+1, col-1}, {row+1, col+1}, {row-1,col+1}};
        for(int[] neighbor : neighbors) {
            int newRow = neighbor[0];
            int newCol = neighbor[1];

            if(newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) {
                continue;
            }

            //If there is an adjacent mine, then count the number of mines
            if(board[newRow][newCol] == 'M') {
                board[row][col]++;
            }
        }

        //There are adjacent mine
        if(board[row][col] > '0'){
            return;
        }

        board[row][col] = 'B';
        for(int[] neighbor : neighbors) {
            traverse(board, new int[]{neighbor[0], neighbor[1]});
        }

    }
}
