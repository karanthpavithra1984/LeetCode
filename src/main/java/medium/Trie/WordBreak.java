package medium.Trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

    /**
     * Time Complexity o(n2 + m*k)
     * Space o(n + m*k)
     * n is the length of the string
     * m is the number of words
     * k is the number of characters in the word
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode head = new TrieNode();
        //Load Trie
        for (String word : wordDict) {
            TrieNode root = head;
            for (Character c : word.toCharArray()) {
                if (!root.children.containsKey(c)) {
                    root.children.put(c, new TrieNode());
                }
                root = root.children.get(c);
            }
            root.isWord = true;
        }

        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            //Do the loop for i == 0
            //Start looking for next word only if the previous one was a word.
            if (i != 0 && !dp[i - 1]) {
                continue;
            }

            TrieNode curr = head;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!curr.children.containsKey(c)) {
                    // No words exist
                    break;
                }

                curr = curr.children.get(c);
                if (curr.isWord) {
                    dp[j] = true;
                }
            }
        }

        return dp[s.length() - 1];
    }

    private class TrieNode {
        boolean isWord;
        Map<Character, TrieNode> children;

        TrieNode() {
            this.children = new HashMap<>();
        }
    }
}




