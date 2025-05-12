package hard.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        TrieNode node = new TrieNode();
        for (String word : wordDict) {
            TrieNode root = node;
            for (Character c : word.toCharArray()) {
                if (!root.children.containsKey(c)) {
                    root.children.put(c, new TrieNode());
                }

                root = root.children.get(c);
            }

            root.isWord = true;
        }

        List<String> ans = new ArrayList<>();
        recurse(ans, s, node, 0, "");
        return ans;
    }

    private void recurse(List<String> ans, String s, TrieNode root, int index, String sentence) {
        if (index >= s.length()) {
            ans.add(sentence.trim());
            return;
        }

        TrieNode cur = root;
        for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cur.children.containsKey(c)) {
                return;
            }
            sentence += c;
            cur = cur.children.get(c);
            if (cur.isWord) {
                recurse(ans, s, root, i + 1, sentence + " ");
            }
        }
    }


    private class TrieNode {
        boolean isWord;
        Map<Character, TrieNode> children;

        public TrieNode() {
            this.children = new HashMap<>();
        }
    }
}

