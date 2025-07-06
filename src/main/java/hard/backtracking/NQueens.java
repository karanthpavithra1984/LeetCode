package hard.backtracking;

import java.util.*;

/*
Time Complexity o(!n)
Space Complexity o(n*n) for the board
https://leetcode.com/problems/n-queens/editorial/
 */

public class NQueens {
    private final Set<Integer> cols = new HashSet<>();
    private final Set<Integer> posDiag = new HashSet<>();
    private final Set<Integer> negDiag = new HashSet<>();
    private final List<List<String>> result = new ArrayList<>();
    private int N;

    public List<List<String>> solveNQueens(int n) {
        N = n;
        char[][] board = new char[n][];

        //Fill up each row with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(board, 0);
        return result;
    }

    private void backtrack(char[][] board, int r) {
        if (r == N) {
            //Create a copy of the board , since we are backtracking
            List<String> copy = new ArrayList<>();
            for (char[] row : board) {
                //Convert each row to a string by concatenating characters
                copy.add(new String(row));
            }
            result.add(copy);
            return;
        }

        //now put the queen in each column and find all possible
        for (int c = 0; c < N; c++) {
            if (cols.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)) {
                continue;
            }

            board[r][c] = 'Q';
            cols.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);

            backtrack(board, r + 1);

            board[r][c] = '.';
            cols.remove(c);
            posDiag.remove(r + c);
            negDiag.remove(r - c);
        }
    }
}
