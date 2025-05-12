package medium.Matrix;

/**
 * Time Complexity is o(m*4^n)
 * M is number of cells in the board
 * N is the length of word. you go 4 ways in the backtracking i.e 4^n until u find the word or not.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int ROW = board.length;
        int COL = board[0].length;
        boolean[][] visited = new boolean[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                //Start with first character
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = dfs(i, j, word, 0, ROW, COL, board, visited);
                    if (ans) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean dfs(int rowIndex, int colIndex, String word, int index, int ROW, int COL, char[][] board, boolean[][] visited) {
        //You got the word
        if (index == word.length()) {
            return true;
        }


        if (rowIndex < 0 || colIndex < 0 || rowIndex >= ROW || colIndex >= COL
                || visited[rowIndex][colIndex] || board[rowIndex][colIndex] != word.charAt(index)) {
            return false;
        }

        visited[rowIndex][colIndex] = true;

        if (dfs(rowIndex + 1, colIndex, word, index + 1, ROW, COL, board, visited)
                || dfs(rowIndex, colIndex + 1, word, index + 1, ROW, COL, board, visited)
                || dfs(rowIndex - 1, colIndex, word, index + 1, ROW, COL, board, visited) ||
                dfs(rowIndex, colIndex - 1, word, index + 1, ROW, COL, board, visited)) {
            return true;
        }

        //Back track because the word is not found at this position
        //But this could be part of the word
        visited[rowIndex][colIndex] = false;

        return false;
    }
}
