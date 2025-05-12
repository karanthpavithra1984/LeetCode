package hard.Trie;

import java.util.*;

/**
 * Time Complexity https://leetcode.com/problems/word-search-ii/editorial/
 */

class WordSearchII {
    Set<String> result;
    int ROW;
    int COL;
    int[][] coords = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<String> findWords(char[][] board, String[] words) {
        TrieN trieN = new TrieN();
        for (String word : words) {
            trieN.addWord(word);
        }

        result = new HashSet<>();
        ROW = board.length;
        COL = board[0].length;

        boolean[][] visited = new boolean[ROW][COL];

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                backtrack(board, visited, r, c, trieN, "");
            }
        }

        return new ArrayList<>(result);
    }

    private void backtrack(char[][] board, boolean[][] visited, int r, int c, TrieN trieN, String word) {
        if (r < 0 || r >= ROW || c < 0 || c >= COL || visited[r][c]
                || !trieN.children.containsKey(board[r][c])) {
            return;
        }

        visited[r][c] = true;
        trieN = trieN.children.get(board[r][c]);
        word += board[r][c];
        if (trieN.isWord) {
            result.add(word);
        }

        for (int[] coord : coords) {
            backtrack(board, visited, r + coord[0], c + coord[1], trieN, word);
        }

        // backtrack , since we might have to go over it again
        visited[r][c] = false;
    }
}

class TrieN {
    Map<Character, TrieN> children;
    boolean isWord = false;

    public TrieN() {
        this.children = new HashMap<>();
    }

    public void addWord(String word) {
        TrieN current = this;
        for (Character character : word.toCharArray()) {
            if (!current.children.containsKey(character)) {
                current.children.put(character, new TrieN());
            }
            current = current.children.get(character);
        }

        current.isWord = true;
    }
}
